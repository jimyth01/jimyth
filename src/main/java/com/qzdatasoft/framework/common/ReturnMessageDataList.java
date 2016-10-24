/**Copyright: Copyright (c) 2016, 湖南强智科技发展有限公司*/
package com.qzdatasoft.framework.common;

/**
 * Search结果集存入ReturnMessageInfo的类<br>
 *
 * History:<br> 
 *    . 1.0.0.20161011, com.qzdatasoft.koradji, Create<br>
 *
 */
public class ReturnMessageDataList {

	private int rowCount=0;
	private Object data=null;

	public ReturnMessageDataList(int rowcount, Object data){
		this.rowCount=rowcount;
		this.data=data;
	}
	
	/** Get rowCount */
	public int getRowCount() {
		return rowCount;
	}
	/** Set rowCount */
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}
	/** Get data */
	public Object getData() {
		return data;
	}
	/** Set data */
	public void setData(Object data) {
		this.data = data;
	}

}
