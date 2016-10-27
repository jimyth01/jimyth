import org.apache.activemq.broker.jmx.BrokerViewMBean;
import org.apache.activemq.broker.jmx.QueueViewMBean;
import org.jimyth.util.MBeanServerUtil;
import org.springframework.jmx.support.ConnectorServerFactoryBean;

import javax.management.MBeanServerConnection;
import javax.management.MBeanServerInvocationHandler;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

/**
 * Created by jimyt on 2016-10-25.
 */
public class RMItEST {
    /**
     * 获取状态
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
//        MBeanServerUtil mBeanServerUtil = new MBeanServerUtil();
//        mBeanServerUtil.createMBeanServerConnection("127.0.0.1","1099","jmxrmi","admin","admin");
////        ObjectName contextManageMBean = new ObjectName(objectName);
////        obj = mbConnection.getAttribute(contextManageMBean, propName);
        String objectName = "org.apache.activemq:type=Broker,brokerName=" + "localhost";
        ObjectName name = new ObjectName(objectName);
        ConnectorServerFactoryBean csf = new ConnectorServerFactoryBean();
        csf.setServiceUrl("service:jmx:rmi:///jndi/rmi://localhost:1099/jmxrmi");
        Object obj  =  csf.getServer().getAttribute(name,"Topics");
//        ObjectName[] objs;
////        ObjectName[] objs = topicService.getTopics(objectName, "Topics");
//        Object obj  = mBeanServerUtil.getMbConnection().getAttribute(name, "Topics");
//
//        objs = (ObjectName[])obj;
//
//        System.out.println(objs);
//        JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:1099/jmxrmi");
//        JMXConnector connector = JMXConnectorFactory.connect(url, null);
//        connector.connect();
//        MBeanServerConnection connection = connector.getMBeanServerConnection();

        // 需要注意的是，这里的my-broker必须和上面配置的名称相同
//        ObjectName name = new ObjectName("org.apache.activemq:BrokerName=localhost,Type=Broker");
//        BrokerViewMBean mBean =  (BrokerViewMBean) MBeanServerInvocationHandler.newProxyInstance(connection, name, BrokerViewMBean.class, true);




//        System.out.println("TopicsSize=="+objs.length);


        // System.out.println(mBean.getBrokerName());

//        for(ObjectName queueName : mBean.getQueues()) {
//            QueueViewMBean queueMBean =                     (QueueViewMBean)MBeanServerInvocationHandler.newProxyInstance(connection, queueName, QueueViewMBean.class, true);
//            System.out.println("\n------------------------------\n");
//
//            // 消息队列名称
//            System.out.println("States for queue --- " + queueMBean.getName());
////            queueMBean.get
//            // 队列中剩余的消息数
//            System.out.println("Size --- " + queueMBean.getQueueSize());
//
//            // 消费者数
//            System.out.println("Number of consumers --- " + queueMBean.getConsumerCount());
//
//            // 出队数
//            System.out.println("Number of dequeue ---" + queueMBean.getDequeueCount() );
//        }

    }

}
