package org.jimyth.messageService.entity.mq.topic;

/**
 * Class Subscriber	消息订阅者
 * 
 *
 * @version        V1.0, 2016.10.23 at 07:44:16 CST
 * @author         jimyth    
 */
public class Subscriber {

    /**   订阅者客户端ID */
    private String clientId;

    /**   订阅者名称 */
    private String subscriptionName;

    /**    连接通道的ID*/
    private String connectionId;

    /**    队列或者主题的名 */
    private String destinationName;

    /**    过滤选择器*/
    private String selector;

    /**   尚未被接收的消息 */
    private int pendingQueueSize;

    /**   客户端已经接收的消息 */
    private int dispatchedQueueSize;

    /**   计算被客户端接收的次数 */
    private int dispatchedCounter;

    /**   入队列的消息数 */
    private int enqueueCounter;

    /**   出队列的消息数 */
    private int dequeueCounter;
}


//~ Formatted by Jindent --- http://www.jindent.com
