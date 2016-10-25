/**Copyright: Copyright (c) 2016, 湖南强智科技发展有限公司 */
package com.qzdatasoft.framework.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.servlet.mvc.AbstractController;
//import org.springframework.web.bind.annotation.RequestMapping;



/**
 * Controller基础类
 * 
 * History:<br> 
 *    . 1.0.0.2016-09-22, com.qzdatasoft.koradji, Create<br>
 *
 */
public abstract  class AbstractController {

	protected HttpServletRequest request;  
    protected HttpServletResponse response;  
    protected HttpSession session; 
    protected AuthenticationInfo authenticationInfo=null;
    protected String home="";
      
    @ModelAttribute  
    public void setReqAndRes(HttpServletRequest request, HttpServletResponse response){  
        this.request = request;  
        this.response = response;  
        this.session = request.getSession();
//        this.home=RegularService.getApplicationBaseUrl(request);
    }  
    
}
