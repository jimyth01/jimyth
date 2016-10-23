package org.jimyth.messageService.http.controller;

import java.util.List;

import org.jimyth.messageService.entity.ResultModel;
import org.jimyth.messageService.entity.mq.Producer;
import org.jimyth.messageService.entity.mq.topic.Subscriber;
import org.jimyth.messageService.entity.mq.topic.Topic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Class TopicController        @Descreption  TODO 增加描述
 *
 *
 * @version        V1.0, 2016.10.23 at 03:08:59 CST
 * @author         jimyth
 */
@Controller
@RequestMapping(value = "/v1/topic")
public class TopicController {

    /**
     * Method  创建主题
     *
     *
     * @param JMSDestination    主题名称
     *
     * @return  ResultModel
     */
    @RequestMapping(
        value = "/createTopic",
        method = RequestMethod.POST
    )
    public ResultModel createTopic(@RequestParam("JMSDestination") String JMSDestination) {
        return null;
    }

    /**
     * Method        删除主题
     *
     *
     * @param JMSDestination        主题名称
     *
     * @return  ResultModel
     */
    @RequestMapping(
        value = "/deleteTopic",
        method = RequestMethod.POST
    )
    public ResultModel deleteTopic(@RequestParam("JMSDestination") String JMSDestination) {
        return null;
    }

    /**
     * Method        查看当前主题的所有的订阅者
     *
     *
     * @param queryModel            分页查询条件
     * @param JMSDestination    主题名称
     *
     * @return  List<Subscriber>
     */
    @RequestMapping(
        value = "/listConsumers/all",
        method = RequestMethod.POST
    )
    public List<Subscriber> listAllConsumers(@RequestParam("queryModel") String queryModel,
                                             @RequestParam("JMSDestination") String JMSDestination) {
        return null;
    }

    /**
     * Method  查看当前主题的 持久化 订阅者
     *
     *
     * @param queryModel              分页查询条件
     * @param JMSDestination        主题名称
     *
     * @return  List<Subscriber>
     */
    @RequestMapping(
        value = "/listConsumers/durable",
        method = RequestMethod.POST
    )
    public List<Subscriber> listDurableConsumers(@RequestParam("queryModel") String queryModel,
                                                 @RequestParam("JMSDestination") String JMSDestination) {
        return null;
    }

    /**
     * Method   查询当前主题的所有的非持久化订阅
     *
     *
     * @param queryModel            分页查询条件
     * @param JMSDestination        主题的名称
     *
     * @return  List<Subscriber>
     */
    @RequestMapping(
        value = "/listConsumers/non_durable",
        method = RequestMethod.POST
    )
    public List<Subscriber> listNon_durableConsumers(@RequestParam("queryModel") String queryModel,
                                                     @RequestParam("JMSDestination") String JMSDestination) {
        return null;
    }

    /**
     * Method           当前主题所有的在线的生产者
     *
     *
     * @param queryModel                分页查询条件
     * @param JMSDestination         主题的名称
     *
     * @return  List<Producer>
     */
    @RequestMapping(
        value = "/listProducers",
        method = RequestMethod.POST
    )
    public List<Producer> listProducers(@RequestParam("queryModel") String queryModel,
                                        @RequestParam("JMSDestination") String JMSDestination) {
        return null;
    }

    /**
     * Method 获取所有的主题列表
     *
     *
     * @param queryModel            分页查询条件
     *
     * @return  List<Topic>
     */
    @RequestMapping(
        value = "/listTopics",
        method = RequestMethod.POST
    )
    public List<Topic> listTopics(@RequestParam("queryModel") String queryModel) {
        return null;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
