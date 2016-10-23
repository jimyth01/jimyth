//package org.framework.business.app.controller.webconsole.back;
//
//import com.google.gson.JsonObject;
//import org.apache.activemq.broker.jmx.QueueView;
//import org.apache.log4j.Logger;
//import org.framework.business.app.entity.ResultModel;
//import org.framework.business.app.entity.mq.queue.Message;
//import org.framework.business.app.entity.mq.Producer;
//import org.framework.business.app.entity.mq.queue.Consumer;
//import org.framework.business.app.entity.mq.queue.Queue;
//import org.framework.xcode.jms.activemq.ActivemqSpringProxy;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * Class QueueController        @Descreption  队列的管理
// *
// *
// * @version        V1.0, 2016.10.23 at 11:51:23 CST
// * @author         jimyth
// */
//@Controller
//@RequestMapping(value = "/v1/queue")
//public class QueueController {
//
//    /** @Descreption  日志 */
//    private Logger LOG = Logger.getLogger(getClass());
//
//    /** @Descreption   发送接收代理 */
//    @Autowired
//    @Qualifier("jms_proxy")
//    private ActivemqSpringProxy proxy;
//
//    /**
//     * Method createQueue 创建队列
//     *
//     * @param destination 队列名称
//     *
//     * @return  ResultModel
//     */
//    @RequestMapping(
//        value = "/createQueue",
//        method = RequestMethod.POST
//    )
//    public ResultModel createQueue(@RequestParam("destination") String destination) {
//        return null;
//    }
//
//    /**
//     * Method deleteMessage
//     *
//     *
//     * @Descreption   根据ID删除消息
//     * @param id  消息id
//     * @return
//     */
//    @RequestMapping(
//        value = "/deleteMessage",
//        method = RequestMethod.GET
//    )
//    public ResultModel deleteMessage(@RequestParam("id") String id) {
//        return null;
//    }
//
//    /**
//     * Method deleteQueue
//     *
//     * @Descreption     删除队列
//     * @param destination       队列名称
//     *
//     * @return
//     */
//    @RequestMapping(
//        value = "/deleteQueue",
//        method = RequestMethod.GET
//    )
//    public ResultModel deleteQueue(@RequestParam("destination") String destination) {
//        return null;
//    }
//
//    /**
//     * Method listConsumers
//     *
//     * @Descreption   消费者列表
//     * @param destination   队列名称
//     * @param queryModel    查询分页参数
//     *
//     * @return
//     */
//    @ResponseBody
//    @RequestMapping(
//        value = "/listConsumers",
//        method = RequestMethod.POST
//    )
//    public List<Consumer> listConsumers(@RequestParam("destination") String destination,
//                                        @RequestParam("queryModel") String queryModel) {
//        return null;
//    }
//
//    /**
//     * Method listMessages
//     *
//     * @Descreption  查询 队列名称为destination 的队列里面
//     *
//     * @param destination      队列名称
//     * @param queryModel  分页查询参数
//     *
//     * @return ResultModel
//     */
//    @ResponseBody
//    @RequestMapping(
//        value = "/listMessages",
//        method = RequestMethod.GET
//    )
//    public List<Message> listMessages(@RequestParam("destination") String destination,
//                                      @RequestParam("queryModel") String queryModel) {
//        return null;
//    }
//
//    /**
//     * Method listProducers
//     * @Descreption  生产者列表
//     *
//     * @param destination   队列名称
//     * @param queryModel    分页查询参数
//     *
//     * @return
//     */
//    @ResponseBody
//    @RequestMapping(
//        value = "/listProducers",
//        method = RequestMethod.POST
//    )
//    public List<Producer> listProducers(@RequestParam("destination") String destination,
//                                        @RequestParam("queryModel") String queryModel) {
//        return null;
//    }
//
//    /**
//     * Method listQueues
//     * @Descreption 查询队列列表
//     *
//     * @param queryModel 分页查询参数
//     *
//     * @return  ResultModel
//     */
//    @ResponseBody
//    @RequestMapping(
//        value = "/listQueues",
//        method = RequestMethod.POST
//    )
//    public List<Queue> listQueues(@RequestParam("queryModel") String queryModel) {
//
//        // todo 按照queryModel 查询Queue list
//        List<QueueView> queueViewList = null;
//
//        return null;
//    }
//
//    /**
//     * Method purgeMessages
//     * @Descreption   删除队列的所有消息
//     *
//     * @param destination
//     *
//     * @return  ResultModel
//     */
//    @RequestMapping(
//        value = "/purge",
//        method = RequestMethod.GET
//    )
//    public ResultModel purge(@RequestParam("destination") String destination) {
//        return null;
//    }
//
//    /**
//     * Method receive  接收队列消息
//     *
//     * @param destination   队列名称
//     *
//     * @return  ResultModel
//     */
//    @ResponseBody
//    @RequestMapping(
//        value = "/receive",
//        method = RequestMethod.POST
//    )
//    public Message receive(@RequestParam("destination") String destination) {
//        return null;
//    }
//
//    /**
//     * @Descreption   发送消息
//     *
//     * @param destination   队列名称
//     * @param message       文本消息内容
//     *
//     * @return  Object
//     */
//    @ResponseBody
//    @RequestMapping(
//        value = "/send",
//        method = RequestMethod.POST
//    )
//    public ResultModel send(@RequestParam("destination") String destination, @RequestParam("message") String message) {
//        Map<String, Object> map = new HashMap<String, Object>();
//
//        proxy.sendMessage(destination, message);
//
//        JsonObject object = new JsonObject();
//
//        map.put("success", Boolean.TRUE);
//        map.put("items", "123");
//        map.put("status", 0);
//
//        return null;
//    }
//
//    /**
//     * Method viewMessage
//     * 查看队列destination 内 指定Id的消息内容
//     *
//     * @param destination
//     * @param id
//     *
//     * @return List
//     */
//    @ResponseBody
//    @RequestMapping(
//        value = "/viewMessage",
//        method = RequestMethod.POST
//    )
//    public ResultModel viewMessage(@RequestParam("destination") String destination, @RequestParam("id") String id) {
//        return null;
//    }
//}
//
//
////~ Formatted by Jindent --- http://www.jindent.com
