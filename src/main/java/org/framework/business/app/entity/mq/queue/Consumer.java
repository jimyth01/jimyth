package org.framework.business.app.entity.mq.queue;

/**
 * Created by jimyt on 2016-10-23.
 */
public class Consumer {

    /** @Descreption  客户端Id */
    public String clientId;

    /** @Descreption   连接Id */
    public String connectionId;

    /** @Descreption  session Id */
    public String sessionId;

    /** @Descreption   过滤选择器 */
    public String selector;

    /** @Descreption    */
    public int enqueueCounter;

    /** @Descreption  确认消费消息数量*/
    public int dequeueCounter;

    /** @Descreption  接收消息数量*/
    public int dispatchedCounter;

    /** @Descreption  接收队列消息数量 */
    public int dispatchedQueueSize;

    /** @Descreption  预读取消息数量 */
    public int prefetchSize;

    /** @Descreption  控制非持久主题在慢消费（slow consumer）情况下丢弃消息的最大数量 */
    public int maximumPendingMessageLimit;

    /** @Descreption  排他消费*/
    public boolean exclusive;

    /** @Descreption  可追溯消费 */
    public boolean retroactive;
}


//~ Formatted by Jindent --- http://www.jindent.com
