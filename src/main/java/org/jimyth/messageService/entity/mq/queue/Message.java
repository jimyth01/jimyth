package org.jimyth.messageService.entity.mq.queue;

/**
 * Class Message	 消息类
 * 
 *
 * @version        V1.0, 2016.10.23 at 07:35:15 CST
 * @author         jimyth    
 */
public class Message {

    /**    消息Id */
    private String JMSMessageID;

    /**    JMSCorrelationID*/
    private String JMSCorrelationID;

    /**    消息优先级 */
    private int JMSPriority;

    /**     重传 */
    private boolean JMSRedelivered;

    /**    回复*/
    private String JMSReplyTo;

    /**    时间戳*/
    private long JMSTimestamp;

    /**   消息类型 */
    private int JMSType;

    public String getJMSMessageID() {
        return JMSMessageID;
    }

    public void setJMSMessageID(String JMSMessageID) {
        this.JMSMessageID = JMSMessageID;
    }

    public String getJMSCorrelationID() {
        return JMSCorrelationID;
    }

    public void setJMSCorrelationID(String JMSCorrelationID) {
        this.JMSCorrelationID = JMSCorrelationID;
    }

    public int getJMSPriority() {
        return JMSPriority;
    }

    public void setJMSPriority(int JMSPriority) {
        this.JMSPriority = JMSPriority;
    }

    public boolean isJMSRedelivered() {
        return JMSRedelivered;
    }

    public void setJMSRedelivered(boolean JMSRedelivered) {
        this.JMSRedelivered = JMSRedelivered;
    }

    public String getJMSReplyTo() {
        return JMSReplyTo;
    }

    public void setJMSReplyTo(String JMSReplyTo) {
        this.JMSReplyTo = JMSReplyTo;
    }

    public long getJMSTimestamp() {
        return JMSTimestamp;
    }

    public void setJMSTimestamp(long JMSTimestamp) {
        this.JMSTimestamp = JMSTimestamp;
    }

    public int getJMSType() {
        return JMSType;
    }

    public void setJMSType(int JMSType) {
        this.JMSType = JMSType;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
