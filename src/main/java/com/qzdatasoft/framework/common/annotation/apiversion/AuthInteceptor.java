/**Copyright: Copyright (c) 2016, 湖南强智科技发展有限公司*/
package com.qzdatasoft.framework.common.annotation.apiversion;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthInteceptor extends HandlerInterceptorAdapter
{

    @Override
    public boolean preHandle(HttpServletRequest request,
        HttpServletResponse response, Object handler) throws Exception
    {
        System.out.println("URI: " + request.getRequestURI());
        return true;
    }
    

}