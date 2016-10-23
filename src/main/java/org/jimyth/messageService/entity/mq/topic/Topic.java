package org.jimyth.messageService.entity.mq.topic;

/**
 * Class Topic	  TODO 增加描述
 * 
 *
 * @version        V1.0, 2016.10.23 at 07:46:31 CST
 * @author         jimyth    
 */
public class Topic {

    /**   主题名称*/
    private String name;

    /**   订阅者数量 */
    private int consumerCount;

    /**   入队列的消息数 */
    private int enqueueCount;

    /**    出队列的消息数*/
    private int dequeueCount;
}


//~ Formatted by Jindent --- http://www.jindent.com
