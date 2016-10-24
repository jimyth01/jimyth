package com.qzdatasoft.framework.i18n;

/**
* messageSource自定义代码
*/

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.support.AbstractMessageSource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;


public class MessageResource extends AbstractMessageSource implements ResourceLoaderAware
{
    @SuppressWarnings("unused")
    private ResourceLoader resourceLoader;

    /**
     * Map切分字符
     */
    protected final String MAP_SPLIT_CODE = "|";
    private final Map<String, String> properties = new HashMap<String, String>();

    public MessageResource() 
    {
        reload();
    }

    public void reload() {
        properties.clear();
        properties.putAll(loadTexts());
    }

    /**
     * 
     * 描述：TODO
     * 查询数据 虚拟数据，可以从数据库读取信息，此处省略
     * @return
     */
    private List<Resource> getResource(){
        List<Resource> resources = new ArrayList<Resource>();

        Resource re = new Resource();
//        re.setResourceId(1);
//        re.setName("common.name");
//        re.setText("name");
//        re.setLanguage("en");
//        resources.add(0, re);
//        
//        Resource re1 = new Resource();
//        re1.setResourceId(2);
//        re1.setName("common.name");
//        re1.setText("\u59D3\u540D");
//        re1.setLanguage("zh");
//        resources.add(1, re1);
//        
//        Resource re3 = new Resource();
//        re1.setResourceId(2);
//        re1.setName("success");
//        re1.setText("\u59D3\u540D");
//        re1.setLanguage("zh");
//        resources.add(1, re3);
        
        resources.add(newRes("success","成功","zh"));
        resources.add(newRes("common.name","Name","en"));
        resources.add(newRes("common.name","姓名","zh"));
        resources.add(newRes("kaptcha.success","验证码正确","zh"));
        resources.add(newRes("kaptcha.error","验证码错误","zh"));
        resources.add(newRes("error.errorCode.notfound","错误代码 [%s] 没有定义。","zh"));
        resources.add(newRes("error.errorCode.notfound","ErrorCode [%s] not found.","en"));
        
        return resources;
    }

    private int i=0;
    private Resource newRes(String code, String msg, String local){
        Resource re = new Resource();
        re.setResourceId(i++);
        re.setName(code);
        re.setText(msg);
        re.setLanguage(local);
    	return re;
    }
    /**
     * 
     * 描述：TODO
     * 加载数据
     * @return
     */
    protected Map<String, String> loadTexts() {
        Map<String, String> mapResource = new HashMap<String, String>();
        List<Resource> resources = this.getResource();
        for (Resource item : resources) {
            String code = item.getName() + MAP_SPLIT_CODE + item.getLanguage();
            mapResource.put(code, item.getText());
        }
        return mapResource;
    }

    /**
     * 
     * 描述：TODO
     * @param code   
     * @param locale 本地化语言
     * @return
     */
    private String getText(String code, Locale locale) {
        String localeCode = locale.getLanguage(); 
        String key = code + MAP_SPLIT_CODE + localeCode;
        String localeText = properties.get(key);
        String resourceText = code;

        if(localeText != null) {
            resourceText = localeText;
        }
        else {
            localeCode = Locale.ENGLISH.getLanguage();
            key = code + MAP_SPLIT_CODE + localeCode;
            localeText = properties.get(key);
            if(localeText != null) {
                resourceText = localeText;
            }
            else {
                try {
                    if(getParentMessageSource() != null) {
                        resourceText = getParentMessageSource().getMessage(code, null, locale);
                    }
                    //else
                    //	 logger.error("Cannot found message with code: "+ code+" ,Beacuase messageSource not exists.");
                } catch (Exception e) {
                    //logger.error("Cannot found message with code: " + code);
                }
            }
        }
        if(resourceText.equals(code)){
       	 	String format =properties.get("error.errorCode.notfound"  + MAP_SPLIT_CODE +  locale.getLanguage());
            logger.error(String.format(format , code));
        }
        return resourceText;
    }

    public void setResourceLoader(ResourceLoader resourceLoader)
    {
        this.resourceLoader = (resourceLoader != null ? resourceLoader : new DefaultResourceLoader());
    }

    @Override
    protected MessageFormat resolveCode(String code, Locale locale)
    {
        String msg = getText(code, locale);
        MessageFormat result = createMessageFormat(msg, locale);
        return result;
    }

    @Override
    protected String resolveCodeWithoutArguments(String code, Locale locale) {
        String result = getText(code, locale);
        return result;
    }
}