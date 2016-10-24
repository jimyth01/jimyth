package com.qzdatasoft.framework.utils;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.qzdatasoft.framework.i18n.Local;

public class MessageHelper {
  
	protected static final Log logger = LogFactory.getLog(MessageHelper.class);
	public static String getMessage(HttpServletRequest request,String key)
    {
		String result = key;
		try{
				result=Local.getMessage(request, key);
		}catch(Exception e){
			String errorMsg=Local.getMessage(request, "error.ErrorCode.notfound");
			logger.error(System.out.format(errorMsg, key));
		}
		return result;
    }  
    
    public static String getMessage( java.util.Locale  locale, String key)
    {
    	//return Local.getMessage(locale, key);
		String result = key;
		try{
				result=Local.getMessage(locale, key);
		}catch(Exception e){
			String errorMsg=Local.getMessage(locale, "error.ErrorCode.notfound");
			logger.error(System.out.format(errorMsg, key));
		}
		return result;
   }  
   
    public static String getMessage(String key)
    {
    	//return Local.getMessage(key);
    	String result = key;
		try{
				result=Local.getMessage(key);
		}catch(Exception e){
			String errorMsg=Local.getMessage("error.ErrorCode.notfound");
			logger.error(System.out.format(errorMsg, key));
		}
		return result;
    }  
}
