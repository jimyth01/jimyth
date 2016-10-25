import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.jimyth.messageService.entity.mq.queue.Queue;
import org.jimyth.messageService.entity.mq.topic.Topic;

/**
 * Created by jimyt on 2016-10-26.
 */
public class GetData {
    public static void main(String[] args) throws Exception {
        Gson gson = new Gson();
        Topic topic = new Topic();
        topic.setName("TOPIC");
        String  jsontopic = gson.toJson(topic);
        System.out.println(jsontopic);
        Queue queue = new Queue();
        queue.setName("QUEUE");
        String  jsonqueue = gson.toJson(queue);
        System.out.println(jsonqueue);

//        DataHead = "{'queueSize':消息数量,'AverageEnqueueTime':平均时间,'ConsumerCount':消费者数量,'DequeueCount':已消费消息数量,'EnqueueCount':总消息数量,'ExpiredCount':过期消息数量,'InFlightCount':发往客户端尚未ack的消息数量,'MemoryLimit':内存限制,'MemoryPercentUsage':内存使用,'Name':'名称'}}",
//                Data = "{'queueSize':1,'AverageEnqueueTime':123.0,'ConsumerCount':2,'DequeueCount':100,'EnqueueCount':100,'ExpiredCount':100,'InFlightCount':12,'MemoryLimit':100,'MemoryPercentUsage':50,'Name':'TOPIC'}",

    }
}
