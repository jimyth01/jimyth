package org.framework.business.app.entity.mq;

/**
 * Class Producer	@Descreption  TODO 增加描述
 * 
 *
 * @version        V1.0, 2016.10.23 at 07:47:12 CST
 * @author         jimyth    
 */
public class Producer {

    /** @Descreption  客户端Id */
    private String clientId;

    /** @Descreption  生产者sessionId*/
    private String sessionId;

    /** @Descreption  生产者ID */
    private String producerId;

    /** @Descreption   客户端尚未ack积压的消息数量*/
    private int producerWindowSize;

    /** @Descreption  异步转发 */
    private boolean dispatchAsync;

    /** @Descreption  TODO 增加描述 */
    private boolean producerBlocked;

    /** @Descreption   总阻塞时间 */
    private String totalTimeBlocked;

    /** @Descreption   发送消息数量*/
    private int sentCount;
}


//~ Formatted by Jindent --- http://www.jindent.com
