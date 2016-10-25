package org.jimyth.messageService.entity.mq.queue;

/**
 * Class Consumer       队列消费者
 *
 *
 * @version        V1.0, 2016.10.26 at 01:16:53 CST
 * @author         jimyth
 */
public class Consumer {

    /** 客户端Id */
    public String clientId;

    /** 连接Id */
    public String connectionId;

    /** session Id */
    public String sessionId;

    /** 过滤选择器 */
    public String selector;

    /**  */
    public int enqueueCounter;

    /** 确认消费消息数量 */
    public int dequeueCounter;

    /** 接收消息数量 */
    public int dispatchedCounter;

    /** 接收队列消息数量 */
    public int dispatchedQueueSize;

    /** 预读取消息数量 */
    public int prefetchSize;

    /** 控制非持久主题在慢消费（slow consumer）情况下丢弃消息的最大数量 */
    public int maximumPendingMessageLimit;

    /** 排他消费 */
    public boolean exclusive;

    /** 可追溯消费 */
    public boolean retroactive;

    /**
     *
     *
     *
     * @return  String
     */
    public String getClientId() {
        return clientId;
    }

    /**
     *
     *
     *
     * @param clientId
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     *
     *
     *
     * @return  String
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     *
     *
     *
     * @param connectionId
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     *
     *
     *
     * @return  int
     */
    public int getDequeueCounter() {
        return dequeueCounter;
    }

    /**
     *
     *
     *
     * @param dequeueCounter
     */
    public void setDequeueCounter(int dequeueCounter) {
        this.dequeueCounter = dequeueCounter;
    }

    /**
     *
     *
     *
     * @return  int
     */
    public int getDispatchedCounter() {
        return dispatchedCounter;
    }

    /**
     *
     *
     *
     * @param dispatchedCounter
     */
    public void setDispatchedCounter(int dispatchedCounter) {
        this.dispatchedCounter = dispatchedCounter;
    }

    /**
     *
     *
     *
     * @return  int
     */
    public int getDispatchedQueueSize() {
        return dispatchedQueueSize;
    }

    /**
     *
     *
     *
     * @param dispatchedQueueSize
     */
    public void setDispatchedQueueSize(int dispatchedQueueSize) {
        this.dispatchedQueueSize = dispatchedQueueSize;
    }

    /**
     *
     *
     *
     * @return  int
     */
    public int getEnqueueCounter() {
        return enqueueCounter;
    }

    /**
     *
     *
     *
     * @param enqueueCounter
     */
    public void setEnqueueCounter(int enqueueCounter) {
        this.enqueueCounter = enqueueCounter;
    }

    /**
     *
     *
     *
     * @return  boolean
     */
    public boolean isExclusive() {
        return exclusive;
    }

    /**
     *
     *
     *
     * @param exclusive
     */
    public void setExclusive(boolean exclusive) {
        this.exclusive = exclusive;
    }

    /**
     *
     *
     *
     * @return  int
     */
    public int getMaximumPendingMessageLimit() {
        return maximumPendingMessageLimit;
    }

    /**
     *
     *
     *
     * @param maximumPendingMessageLimit
     */
    public void setMaximumPendingMessageLimit(int maximumPendingMessageLimit) {
        this.maximumPendingMessageLimit = maximumPendingMessageLimit;
    }

    /**
     *
     *
     *
     * @return  int
     */
    public int getPrefetchSize() {
        return prefetchSize;
    }

    /**
     *
     *
     *
     * @param prefetchSize
     */
    public void setPrefetchSize(int prefetchSize) {
        this.prefetchSize = prefetchSize;
    }

    /**
     *
     *
     *
     * @return  boolean
     */
    public boolean isRetroactive() {
        return retroactive;
    }

    /**
     *
     *
     *
     * @param retroactive
     */
    public void setRetroactive(boolean retroactive) {
        this.retroactive = retroactive;
    }

    /**
     *
     *
     *
     * @return  String
     */
    public String getSelector() {
        return selector;
    }

    /**
     *
     *
     *
     * @param selector
     */
    public void setSelector(String selector) {
        this.selector = selector;
    }

    /**
     *
     *
     *
     * @return  String
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     *
     *
     *
     * @param sessionId
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
