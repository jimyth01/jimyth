package org.jimyth.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.management.MBeanServerConnection;
import javax.management.remote.JMXConnector;
import javax.management.remote.rmi.RMIConnector;
import javax.management.remote.rmi.RMIServer;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
 * <p>
 * JMX服务连接管理
 * <p>
 *
 * @date 2013-7-11 <br>
 * @author li_zhi1 <br>
 * @version 9.0.0 <br>
 *
 */
public class MBeanServerUtil {
    JMXConnector jmxConnector = null;
    MBeanServerConnection mbConnection = null;

    public MBeanServerUtil() {

    }

    /**
     * 创建JMX连接
     *
     * @return
     */
    public MBeanServerConnection createMBeanServerConnection() {
        String remoteIP = "127.0.0.1";
        String remotePort = "1099";
        String remoteName = "karaf-trun";
        String userName = "tadmin";
        String password = "tadmin";

        try {
            // 获取org.apache.karaf.management.cfg配置文件内容
            Dictionary dictionary = this.getDictionary("org.apache.karaf.management");
            // 获取port
            String remotePortV = (String) dictionary.get("rmiRegistryPort");
            if (remotePortV != null) {
                remotePort = remotePortV;
            }
            // 获取角色
            String role = (String) dictionary.get("jmxRole");
            if (role == null) {
                role = System.getProperty("karaf.admin.role");
            }
            // 获取路径
            String path = System.getProperty("karaf.home")+ File.separator+"etc"+File.separator+"users.properties";
            // 获取users.properties内容
            Properties prop = new Properties();
            InputStream fis = new FileInputStream(path);
            prop.load(fis);
            boolean flag = false;
            // 获取users.properties的key值
            Iterator keys = prop.keySet().iterator();
            // 根据key值获取对应的value，分别是密码、角色1、角色2
            while (keys.hasNext()) {
                String key = (String) keys.next();
                String value = prop.getProperty(key);
                if (value != null) {
                    String user[] = value.split(",");
                    for (int i = 1; i < user.length; i++) {
                        if (user[i].equals(role)) {
                            // 获取用户名
                            userName = key;
                            // 获取密码
                            password = user[0];
                            flag = true;
                            break;
                        }
                    }
                    if (flag)
                        break;
                }
            }
            String karafName = System.getProperty("karaf.name");
            remoteName = "karaf-" + karafName;
                remoteIP = "127.0.0.1";
        } catch (Exception e) {
            e.printStackTrace();
        }
        MBeanServerConnection conn = createMBeanServerConnection(remoteIP,
                remotePort, remoteName, userName, password);
        return conn;
    }

    /**
     * 创建指定JMX连接
     *
     * @param remoteIP
     * @param remotePort
     * @param remoteName
     * @param userName
     * @param password
     * @return
     */
    public MBeanServerConnection createMBeanServerConnection(String remoteIP,
                                                             String remotePort, String remoteName, String userName,
                                                             String password) {
        MBeanServerConnection mbs = null;
        try {
            Registry registry = LocateRegistry.getRegistry(remoteIP,
                    Integer.parseInt(remotePort));
            RMIServer stub = null;
            // JMXConnector jmxConnector = null;
            if (stub == null) {
                stub = (RMIServer) registry.lookup(remoteName);
            }
            Map env = new HashMap();
            String[] creds = { userName, password };
            env.put(JMXConnector.CREDENTIALS, creds);

            jmxConnector = new RMIConnector(stub, env);
            jmxConnector.connect();
            mbs = jmxConnector.getMBeanServerConnection();
            this.mbConnection = mbs;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return mbs;
    }

    /**
     * 创建JMX连接
     *
     * @return
     */
    public MBeanServerConnection createBrokerMBeanServerConnection() {
        String remoteIP = "127.0.0.1";
        String remotePort = "1099";
        String remoteName = "jmxrmi";
        String userName = "";
        String password = "";
        // 获取路径
        String path = System.getProperty("karaf.home")+ File.separator+"etc"+File.separator+"inforbroker.xml";
        MBeanServerConnection conn = null;
        try {
            // 创建 DocumentBuilderFactory，DocumentBuilderFactory 对象创建
            // DocumentBuilder。
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            // 创建 DocumentBuilder，DocumentBuilder 执行实际的解析以创建 Document 对象。
            DocumentBuilder db = dbf.newDocumentBuilder();
            // 解析文件以创建 Document 对象
            Document doc = db.parse(new File(path));
            NodeList databaseList = doc
                    .getElementsByTagName("managementContext");
            for (int j = 0; j < databaseList.getLength(); j++) {
                Node childNode = databaseList.item(j);
                if (!childNode.hasAttributes()) {
                    continue;
                } else {
                    // 取得节点的属性值
                    NamedNodeMap nodeMap = childNode.getAttributes();
                    //是否创建连接,若是true的话，则其他值读取inforbroker.xml里的
                    Node createConnector = nodeMap.getNamedItem("createConnector");
                    if (createConnector != null&& (createConnector.getNodeValue().equals("true"))) {
                        //获取host值
                        Node connectorHost = nodeMap.getNamedItem("connectorHost");
                        if (connectorHost != null) {
                            remoteIP = connectorHost.getNodeValue();
                        }
                        //获取connectorPath值
                        Node connectorPath = nodeMap.getNamedItem("connectorPath");
                        if (connectorPath != null) {
                            remoteName = connectorPath.getNodeValue().substring(1);
                        }
                        //获取connectorPort值
                        Node connectorPort = nodeMap.getNamedItem("connectorPort");
                        if (connectorPort != null) {
                            remotePort = connectorPort.getNodeValue();
                        }
                    }

                }
            }
            conn = createMBeanServerConnection(remoteIP, remotePort,remoteName, userName, password);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 关闭JMX连接
     */
    public void closeJMXConnector() {
        try {
            jmxConnector.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @return the jmxConnector
     */
    public JMXConnector getJmxConnector() {
        return jmxConnector;
    }

    /**
     * @param jmxConnector
     *            the jmxConnector to set
     */
    public void setJmxConnector(JMXConnector jmxConnector) {
        this.jmxConnector = jmxConnector;
    }

    /**
     * @return the mbConnection
     */
    public MBeanServerConnection getMbConnection() {
        return mbConnection;
    }

    /**
     * @param mbConnection
     *            the mbConnection to set
     */
    public void setMbConnection(MBeanServerConnection mbConnection) {
        this.mbConnection = mbConnection;
    }

    /**
     * 获取属性列表
     *
     * @param str
     *            配置文件名
     * @return add by lin_wwei
     */
    @SuppressWarnings({ "rawtypes" })
    public Dictionary getDictionary(String str) {
        Dictionary dictionary = null;
//        try {
//            ConfigurationAdmin ca = ConfigurationAdminHolder.getCa();
//            Configuration config = ca.getConfiguration(str);
//            dictionary = config.getProperties();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return dictionary;
    }
}
