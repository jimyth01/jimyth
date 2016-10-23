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
}


//~ Formatted by Jindent --- http://www.jindent.com
