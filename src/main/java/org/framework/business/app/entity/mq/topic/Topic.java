package org.framework.business.app.entity.mq.topic;

/**
 * Class Topic	@Descreption  TODO 增加描述
 * 
 *
 * @version        V1.0, 2016.10.23 at 07:46:31 CST
 * @author         jimyth    
 */
public class Topic {

    /** @Descreption  主题名称*/
    private String name;

    /** @Descreption  订阅者数量 */
    private int consumerCount;

    /** @Descreption  入队列的消息数 */
    private int enqueueCount;

    /** @Descreption   出队列的消息数*/
    private int dequeueCount;
}


//~ Formatted by Jindent --- http://www.jindent.com
