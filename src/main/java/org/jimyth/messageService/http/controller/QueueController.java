package org.jimyth.messageService.http.controller;

import java.util.List;

import org.jimyth.messageService.entity.QueryModel;
import org.jimyth.messageService.entity.ResultModel;
import org.jimyth.messageService.entity.mq.Producer;
import org.jimyth.messageService.entity.mq.queue.Consumer;
import org.jimyth.messageService.entity.mq.queue.Message;
import org.jimyth.messageService.entity.mq.queue.Queue;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Class QueueController         队列操作类
 *
 *
 * @version        V1.0, 2016.10.23 at 03:02:11 CST
 * @author         jimyth
 */
@Controller
@RequestMapping(value = "/v1/queue")
public class QueueController {

    /**
     * Method  创建新的队列
     *
     *
     * @param JMSDestination    队列的名称
     *
     * @return  ResultModel
     */
    @RequestMapping(
        value = "/create",
        method = RequestMethod.GET
    )
    public ResultModel create(@RequestParam("JMSDestination") String JMSDestination) {
        return null;
    }

    /**
     * Method  删除消息
     *
     *
     * @param messageId     消息的ID
     *
     * @return  ResultModel
     */
    @RequestMapping(
        value = "/deleteMessage",
        method = RequestMethod.POST
    )
    public ResultModel deleteMessage(@RequestParam("messageId") String messageId) {
        return null;
    }

    /**
     * Method  删除队列
     *
     *
     * @param JMSDestination    队列的名称
     *
     * @return  ResultModel
     */
    @RequestMapping(
        value = "/deleteQueue",
        method = RequestMethod.GET
    )
    public ResultModel deleteQueue(@RequestParam("JMSDestination") String JMSDestination) {
        return null;
    }

    /**
     * Method  获取队列当前在线的所有的消费者
     *
     *
     * @param JMSDestination    队列名称
     * @param queryModel        分页查询条件
     *
     * @return  List<Consumer>
     */
    @ResponseBody
    @RequestMapping(
        value = "/listConsumers",
        method = RequestMethod.POST
    )
    public List<Consumer> listConsumers(@RequestParam("JMSDestination") String JMSDestination,
                                        @ModelAttribute QueryModel queryModel) {
        return null;
    }

    /**
     * Method    获取队列的所有消息
     *
     *
     * @param JMSDestination    队列的名称
     * @param queryModel        分页查询条件
     *
     * @return  List<Message>
     */
    @ResponseBody
    @RequestMapping(
        value = "/listMessages",
        method = RequestMethod.POST
    )
    public List<Message> listMessages(@RequestParam("JMSDestination") String JMSDestination,
                                      @ModelAttribute QueryModel queryModel) {
        return null;
    }

    /**
     * Method    获取队列当前在线的所有的生产者
     *
     *
     * @param JMSDestination    队列名称
     * @param queryModel        分页查询条件
     *
     * @return  List<Producer>
     */
    @ResponseBody
    @RequestMapping(
        value = "/listProducers",
        method = RequestMethod.POST
    )
    public List<Producer> listProducers(@RequestParam("JMSDestination") String JMSDestination,
                                        @ModelAttribute QueryModel queryModel) {
        return null;
    }

    /**
     * Method  获取所有的队列
     *
     *
     * @param queryModel    分页查询条件
     *
     * @return  List<Queue>
     */
    @ResponseBody
    @RequestMapping(
        value = "/listQueues",
        method = RequestMethod.POST
    )
    public List<Queue> listQueues(@ModelAttribute QueryModel queryModel) {
        return null;
    }

    /**
     * Method        清除队列中未消费的消息，将其置为已消费
     *
     *
     * @param JMSDestination        队列名称
     *
     * @return  ResultModel
     */
    @RequestMapping(
        value = "/purge",
        method = RequestMethod.POST
    )
    public ResultModel purge(@RequestParam("JMSDestination") String JMSDestination) {
        return null;
    }

    /**
     * Method        接受消息
     *
     *
     * @param JMSDestination        队列名称
     *
     * @return  Message
     */
    @ResponseBody
    @RequestMapping(
        value = "/receive",
        method = RequestMethod.POST
    )
    public Message receive(@RequestParam("JMSDestination") String JMSDestination) {
        return null;
    }

    /**
     * Method    发送文本消息
     *
     *
     * @param JMSDestination    队列名称
     * @param message               消息内容
     *
     * @return  ResultModel
     */
    @ResponseBody
    @RequestMapping(
        value = "/send",
        method = RequestMethod.POST
    )
    public ResultModel send(@RequestParam("JMSDestination") String JMSDestination,
                            @RequestParam("message") String message) {
        return null;
    }

    /**
     * Method    查看消息
     *
     *
     * @param JMSDestination        队列名称
     * @param messageId                消息的Id
     *
     * @return  Message
     */
    @ResponseBody
    @RequestMapping(
        value = "/viewMessage",
        method = RequestMethod.POST
    )
    public Message viewMessage(@RequestParam("JMSDestination") String JMSDestination,
                               @RequestParam("messageId") String messageId) {
        return null;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
