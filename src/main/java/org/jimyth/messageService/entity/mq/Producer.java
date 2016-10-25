package org.jimyth.messageService.entity.mq;

/**
 * Class Producer	  生产者
 * 
 *
 * @version        V1.0, 2016.10.23 at 07:47:12 CST
 * @author         jimyth    
 */
public class Producer {

    /**   客户端Id */
    private String clientId;

    /**   生产者sessionId*/
    private String sessionId;

    /**   生产者ID */
    private String producerId;

    /**    客户端尚未ack积压的消息数量*/
    private int producerWindowSize;

    /**   异步转发 */
    private boolean dispatchAsync;

    /**   是否阻塞 */
    private boolean producerBlocked;

    /**    总阻塞时间 */
    private String totalTimeBlocked;

    /**    发送消息数量*/
    private int sentCount;
}


//~ Formatted by Jindent --- http://www.jindent.com
