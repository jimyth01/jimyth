package org.jimyth.messageService.entity.mq;

/**
 * Class Destination	JMS的目的地
 * 
 *
 * @version        V1.0, 2016.10.26 at 01:17:37 CST
 * @author         jimyth    
 */
public class Destination {

    /** 平均时间 */
    private double AverageEnqueueTime = 123l;

    /** 消费者数量 */
    private int ConsumerCount = 2;

    /** 已消费消息数量 */
    private int DequeueCount = 100;

    /** 总消息数量 */
    private int EnqueueCount = 100;

    /** 过期消息数量 */
    private int ExpiredCount = 100;

    /** 发往客户端尚未ack的消息数量 */
    private int InFlightCount = 12;

    /** 内存限制 */
    private long MemoryLimit = 100l;

    /** 内存使用 */
    private int MemoryPercentUsage = 50;

    /** 名称 */
    private String Name;

    /**
     *
     * 
     *
     * @return	double
     */
    public double getAverageEnqueueTime() {
        return AverageEnqueueTime;
    }

    /**
     *
     * 
     *
     * @param averageEnqueueTime
     */
    public void setAverageEnqueueTime(double averageEnqueueTime) {
        AverageEnqueueTime = averageEnqueueTime;
    }

    /**
     *
     * 
     *
     * @return	int
     */
    public int getConsumerCount() {
        return ConsumerCount;
    }

    /**
     *
     * 
     *
     * @param consumerCount
     */
    public void setConsumerCount(int consumerCount) {
        ConsumerCount = consumerCount;
    }

    /**
     *
     * 
     *
     * @return	int
     */
    public int getDequeueCount() {
        return DequeueCount;
    }

    /**
     *
     * 
     *
     * @param dequeueCount
     */
    public void setDequeueCount(int dequeueCount) {
        DequeueCount = dequeueCount;
    }

    /**
     *
     * 
     *
     * @return	int
     */
    public int getEnqueueCount() {
        return EnqueueCount;
    }

    /**
     *
     * 
     *
     * @param enqueueCount
     */
    public void setEnqueueCount(int enqueueCount) {
        EnqueueCount = enqueueCount;
    }

    /**
     *
     * 
     *
     * @return	int
     */
    public int getExpiredCount() {
        return ExpiredCount;
    }

    /**
     *
     * 
     *
     * @param expiredCount
     */
    public void setExpiredCount(int expiredCount) {
        ExpiredCount = expiredCount;
    }

    /**
     *
     * 
     *
     * @return	int
     */
    public int getInFlightCount() {
        return InFlightCount;
    }

    /**
     *
     * 
     *
     * @param inFlightCount
     */
    public void setInFlightCount(int inFlightCount) {
        InFlightCount = inFlightCount;
    }

    /**
     *
     * 
     *
     * @return	long
     */
    public long getMemoryLimit() {
        return MemoryLimit;
    }

    /**
     *
     * 
     *
     * @param memoryLimit
     */
    public void setMemoryLimit(long memoryLimit) {
        MemoryLimit = memoryLimit;
    }

    /**
     *
     * 
     *
     * @return	int
     */
    public int getMemoryPercentUsage() {
        return MemoryPercentUsage;
    }

    /**
     *
     * @param memoryPercentUsage
     */
    public void setMemoryPercentUsage(int memoryPercentUsage) {
        MemoryPercentUsage = memoryPercentUsage;
    }

    /**
     *
     * 
     *
     * @return	String
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * 
     *
     * @param name
     */
    public void setName(String name) {
        Name = name;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
