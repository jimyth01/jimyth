package org.jimyth.messageService.entity.mq.queue;

/**
 * Class Queue  队列信息
 *
 *
 * @version        V1.0, 2016.10.23 at 07:33:34 CST
 * @author         jimyth
 */
public class Queue {

    /**   队列名字 */
    private String name;

    /**    队列大小 */
    private int queueSize;

    /**    消费者数量 */
    private int consumerCount;

    /**    总消息数量 */
    private int enqueueCount;

    /**    已消费消息数量 */
    private int dequeueCount;
}


//~ Formatted by Jindent --- http://www.jindent.com
