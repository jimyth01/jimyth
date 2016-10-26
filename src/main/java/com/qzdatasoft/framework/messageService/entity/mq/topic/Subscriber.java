package com.qzdatasoft.framework.messageService.entity.mq.topic;

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

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public int getPendingQueueSize() {
        return pendingQueueSize;
    }

    public void setPendingQueueSize(int pendingQueueSize) {
        this.pendingQueueSize = pendingQueueSize;
    }

    public int getDispatchedQueueSize() {
        return dispatchedQueueSize;
    }

    public void setDispatchedQueueSize(int dispatchedQueueSize) {
        this.dispatchedQueueSize = dispatchedQueueSize;
    }

    public int getDispatchedCounter() {
        return dispatchedCounter;
    }

    public void setDispatchedCounter(int dispatchedCounter) {
        this.dispatchedCounter = dispatchedCounter;
    }

    public int getEnqueueCounter() {
        return enqueueCounter;
    }

    public void setEnqueueCounter(int enqueueCounter) {
        this.enqueueCounter = enqueueCounter;
    }

    public int getDequeueCounter() {
        return dequeueCounter;
    }

    public void setDequeueCounter(int dequeueCounter) {
        this.dequeueCounter = dequeueCounter;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
