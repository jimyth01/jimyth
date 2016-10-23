package org.jimyth.messageService.entity.mq.queue;

/**
 * Created by jimyt on 2016-10-23.
 */
public class Consumer {

    /**   客户端Id */
    public String clientId;

    /**    连接Id */
    public String connectionId;

    /**   session Id */
    public String sessionId;

    /**    过滤选择器 */
    public String selector;

    /**     */
    public int enqueueCounter;

    /**   确认消费消息数量*/
    public int dequeueCounter;

    /**   接收消息数量*/
    public int dispatchedCounter;

    /**   接收队列消息数量 */
    public int dispatchedQueueSize;

    /**   预读取消息数量 */
    public int prefetchSize;

    /**   控制非持久主题在慢消费（slow consumer）情况下丢弃消息的最大数量 */
    public int maximumPendingMessageLimit;

    /**   排他消费*/
    public boolean exclusive;

    /**   可追溯消费 */
    public boolean retroactive;
}


//~ Formatted by Jindent --- http://www.jindent.com
