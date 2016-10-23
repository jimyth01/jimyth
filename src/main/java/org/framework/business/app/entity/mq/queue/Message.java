package org.framework.business.app.entity.mq.queue;

/**
 * Class Message	 消息类
 * 
 *
 * @version        V1.0, 2016.10.23 at 07:35:15 CST
 * @author         jimyth    
 */
public class Message {

    /** @Descreption   消息Id */
    private String JMSMessageID;

    /** @Descreption   JMSCorrelationID*/
    private String JMSCorrelationID;

    /** @Descreption   消息优先级 */
    private int JMSPriority;

    /** @Descreption    重传 */
    private boolean JMSRedelivered;

    /** @Descreption   回复*/
    private String JMSReplyTo;

    /** @Descreption   时间戳*/
    private long JMSTimestamp;

    /** @Descreption  消息类型 */
    private int JMSType;
}


//~ Formatted by Jindent --- http://www.jindent.com
