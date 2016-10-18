/**Administrator
 * 2015年9月14日
 */
package org.framework.business.app.entity;


import java.util.Map;

/**
 * @author wangpan 2015年9月14日下午4:38:21
 */
public class WSParam {
	private Integer type; // 1 订阅、2 取消、3发送、4 清空
	private Integer assertFlag;// 是否需要应答确认，1为需要 0不需要，默认0;
	private String topicId;// 主题、队列，唯一
	private String msgId;// 消息ID，唯一
	private String uuid;//
	private String sender;// 发送者
	private String reciver;// 接收者
	private Integer flag;// 控制发送者自己发自己收，1自己发自己收，0 其他，默认0
	private int index;// 每次socket创建index从1开始递增，默认值1
	private String userName;// 用户名,中文名称
	private String sysId;// 系统应用标识
	private String time;// 消息产生时间，用于显示阅读
	private int priority;// 优先级,0至9，默认5，值越大优先级越高
	private int dataType;// 消息体数据类型，0 JSON字符串，1 普通字符串、2字符串、3 HEX字符串，默认0
	private int len;// 消息体数据字节长度，-1表示自动探测，默认-1
	private String vls;// 消息体数据校验码，默认采用和校验，JS不处理
	private String customerExt;// JSON字符串，发送者自定义消息，应答时原数据返回,没有内容时留空
	//private String body;// 消息体
	private String recSelector ;//定义接收消息绑定过滤条件
	private Map<String,Object> selectors; //发送消息绑定的属性

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer isAssert() {
		return assertFlag;
	}

	public void setAssert(Integer assertFlag) {
		this.assertFlag = assertFlag;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReciver() {
		return reciver;
	}

	public void setReciver(String reciver) {
		this.reciver = reciver;
	}

	

	public Integer getAssert() {
		return assertFlag;
	}

	public void setAssertFlag(Integer assertFlag) {
		this.assertFlag = assertFlag;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSysId() {
		return sysId;
	}

	public void setSysId(String sysId) {
		this.sysId = sysId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getDataType() {
		return dataType;
	}

	public void setDataType(int dataType) {
		this.dataType = dataType;
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public String getVls() {
		return vls;
	}

	public void setVls(String vls) {
		this.vls = vls;
	}

	public String getCustomerExt() {
		return customerExt;
	}

	public void setCustomerExt(String customerExt) {
		this.customerExt = customerExt;
	}

	/*public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
*/


	public Map<String, Object> getSelectors() {
		return selectors;
	}

	public void setSelectors(Map<String, Object> selectors) {
		this.selectors = selectors;
	}

	public Integer getAssertFlag() {
		return assertFlag;
	}

	public String getRecSelector() {
		return recSelector;
	}

	public void setRecSelector(String recSelector) {
		this.recSelector = recSelector;
	}
}
