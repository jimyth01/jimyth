/**Copyright: Copyright (c) 2016, 湖南强智科技发展有限公司*/
package com.qzdatasoft.framework.common.annotation.apiversion;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.web.bind.annotation.Mapping;

/**
 * 接口版本标识注解<br>
 * History:<br> 
 *    . 1.0.0.20160914, com.qzdatasoft.koradji, Create<br>
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface ApiVersion {
	
	/**
	 * 版本号
	 * @return
	 */
    int value();
}