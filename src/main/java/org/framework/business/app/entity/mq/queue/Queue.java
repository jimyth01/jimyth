package org.framework.business.app.entity.mq.queue;

/**
 * Class Queue  队列信息
 *
 *
 * @version        V1.0, 2016.10.23 at 07:33:34 CST
 * @author         jimyth
 */
public class Queue {

    /** @Descreption  队列名字 */
    private String name;

    /** @Descreption   队列大小 */
    private int queueSize;

    /** @Descreption   消费者数量 */
    private int consumerCount;

    /** @Descreption   总消息数量 */
    private int enqueueCount;

    /** @Descreption   已消费消息数量 */
    private int dequeueCount;
}


//~ Formatted by Jindent --- http://www.jindent.com
