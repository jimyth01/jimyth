package org.jimyth.messageService.entity.mq.queue;

import org.jimyth.messageService.entity.mq.Destination;

/**
 * Class Queue  队列信息
 *
 *
 * @version        V1.0, 2016.10.23 at 07:33:34 CST
 * @author         jimyth
 */
public class Queue extends Destination {

    /**  队列大小 */
    private int queueSize =1;

    public int getQueueSize() {
        return queueSize;
    }

    public void setQueueSize(int queueSize) {
        this.queueSize = queueSize;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
