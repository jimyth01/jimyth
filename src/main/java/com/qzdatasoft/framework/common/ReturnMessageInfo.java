/**Copyright: Copyright (c) 2016, 湖南强智科技发展有限公司*/
package com.qzdatasoft.framework.common;

import com.qzdatasoft.framework.utils.MessageHelper;

/**
 * 
 * 通用数据传输结构<br>
 * errorCode 0表示成功，小于0表示出错，大于0由业务定义
 * 
 * History:<br>
 * . 1.0.0.20160910, com.qzdatasoft.koradji, Create<br>
 * 
 */
public class ReturnMessageInfo {
	private String errorCode = Constants.ERROE_CODE_DEEFAULT; // success成功,
																// UnknownException未定义或未初始化的错误代码,
																// 其他由业务定义
	private String errorMessage = Constants.ERROE_CODE_DEFAULT_MESSAGE; // errorCode的详细信息
	private Object data = null; // 数据

	/**
	 * 构造函数
	 */
	public ReturnMessageInfo() {
	}

	/**
	 * 构造函数
	 * 
	 * @param code
	 */
	public ReturnMessageInfo(String code) {
		this(code, MessageHelper.getMessage(code));
	}

	/**
	 * 构造函数
	 * 
	 * @param code
	 * @param message
	 */
	public ReturnMessageInfo(String code, String message) {
		this(code, message, null);
	}

	public ReturnMessageInfo(String code, Object data) {
		this( code, null, data);
	}

	/**
	 * 构造函数
	 * 
	 * @param code
	 * @param message
	 * @param data
	 */
	public ReturnMessageInfo(String code, String message, Object data) {
		this.setErrorCode(code);
		this.data = data;
	}

	/**
	 * 获取错误代码
	 * 
	 * @return
	 */
	public String getErrorCode() {
		return this.errorCode;
	}

	/**
	 * 设置错误代码
	 * 
	 * @param errorCode
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
		this.errorMessage = (errorCode == Constants.ERROE_CODE_DEEFAULT) ? Constants.ERROE_CODE_DEFAULT_MESSAGE
				: MessageHelper.getMessage(errorCode);
	}

	/**
	 * 获取错误信息
	 * 
	 * @return
	 */
	public String getErrorMessage() {
		return this.errorMessage;
	}

//	/**
//	 * 设置错误信息
//	 * 
//	 * @param errorMessage
//	 */
//	public void setErrorMessage(String errorMessage) {
//		this.errorMessage = errorMessage;
//	}

	/**
	 * 获取数据对象
	 * 
	 * @return Object
	 */
	public Object getData() {
		return this.data;
	}

	/**
	 * 设置数据对象
	 * 
	 * @param data
	 */
	public void setData(Object data) {
		this.data = data;
	}

}
