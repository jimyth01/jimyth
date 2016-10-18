/**Administrator
 * 2015年9月15日
 */
package org.framework.business.app.entity;

/**
 * @author wangpan
 *2015年9月15日上午11:01:37
 */
public class WSDesc {
	private String version;
	private WSParam header;
	private String body;
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	public WSParam getHeader() {
		return header;
	}
	public void setHeader(WSParam header) {
		this.header = header;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	

}
