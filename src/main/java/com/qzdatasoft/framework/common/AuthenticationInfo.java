/**Copyright: Copyright (c) 2016, 湖南强智科技发展有限公司*/
package com.qzdatasoft.framework.common;

/**
 * AuthenticationInfo Description
 *
 * History:<br> 
 *    . 1.0.0.20160928, com.qzdatasoft.Administrator, Create<br>
 *
 */
public class AuthenticationInfo {
	private String userName;
	private String ticket;
	
	/** Get ticket */
	public String getTicket() {
		return ticket;
	}

	/** Set ticket */
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	/** Get userName */
	public String getUserName() {
		return userName;
	}

	/** Set userName */
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
