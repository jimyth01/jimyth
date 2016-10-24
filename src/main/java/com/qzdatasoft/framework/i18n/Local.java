package com.qzdatasoft.framework.i18n;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.qzdatasoft.framework.utils.HttpRequestContextHelper;

public class Local {

    /**
     * 获取本地化消息
     * @param locale
     * @param key
     * @return
     */
	public static final String getMessage(Locale locale, String key) {
		String //result="";
//		try
//		{
			result= getApplicationContext().getMessage(key, null, locale);
//		}catch(Exception e){
//			//Application
//		}
		return result;
	}
	/**
	 * 获取本地化消息
	 * @param request
	 * @param key
	 * @return
	 */
	public static final String getMessage(HttpServletRequest request, String key) {
		return getApplicationContext(request).getMessage(key, null, getSessionLocale(request));
	}
	
	/**
	 * 获取本地化消息
	 * @param key
	 * @return
	 */
	public static final String getMessage(String key) {
		return getApplicationContext().getMessage(key, null, getSessionLocale(HttpRequestContextHelper.getRequest()));
	}

	/**
	 * 从session获取locale，由<a href="?locale=zh_CN">简体中文</a> 设置
	 * @param request
	 * @return
	 */
    public static Locale getSessionLocale(HttpServletRequest request) {
    	Locale locale=Locale.PRC;
    	try{
    		locale= (Locale) request.getSession().getAttribute(	SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME);
    		if(locale==null) locale=Locale.PRC;
    	}catch(Exception e){
    		locale=Locale.PRC;
    	}
    	return locale;
	}
    
    private static ApplicationContext getApplicationContext(HttpServletRequest request)
    {
		return WebApplicationContextUtils
				.getRequiredWebApplicationContext(request.getSession()
				.getServletContext());
    }
    private static ApplicationContext getApplicationContext()
    {
    	ApplicationContext //result=null;
//    	try{
	    	result = WebApplicationContextUtils
					.getRequiredWebApplicationContext(HttpRequestContextHelper.getRequest().getSession()
					.getServletContext());
//    	}catch(Exception e){
//    		//result=com.qzdatasoft.framework.common.ApplicationContext.getApplicationContext();
//    	}
		return result;
    }
	
//	protected final void setSessionLocale(HttpServletRequest request,Locale locale) {
//		request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, locale);
//	}
//	
//	protected final void setSessionLocale(HttpServletRequest request,	String code) {
//		request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, new Locale(code.split("_")[0], code.split("_")[1]));
//	}
	
}
