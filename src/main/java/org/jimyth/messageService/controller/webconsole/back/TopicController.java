//package org.framework.business.app.controller.webconsole.back;
//
//import org.jimyth.messageService.entity.ResultModel;
//import org.jimyth.messageService.entity.mq.Producer;
//import org.jimyth.messageService.entity.mq.topic.Subscriber;
//import org.jimyth.messageService.entity.mq.topic.Topic;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.List;
//
///**
// * Class TopicController        @Descreption  TODO 增加描述
// *
// *
// * @version        V1.0, 2016.10.23 at 12:39:26 CST
// * @author         jimyth
// */
//@Controller
//@RequestMapping(value = "/v1/topic")
//public class TopicController {
//
//    /**
//     * Method @Descreption  TODO 增加描述
//     *
//     *
//     * @param destination
//     *
//     * @return  ResultModel
//     */
//    @RequestMapping(
//        value = "/createTopic",
//        method = RequestMethod.POST
//    )
//    public ResultModel createTopic(@RequestParam("destination") String destination) {
//        return null;
//    }
//
//    /**
//     * Method @Descreption  TODO 增加描述
//     *
//     *
//     * @param destination
//     *
//     * @return  ResultModel
//     */
//    @RequestMapping(
//        value = "/deleteTopic",
//        method = RequestMethod.POST
//    )
//    public ResultModel deleteTopic(@RequestParam("destination") String destination) {
//        return null;
//    }
//
//    /**
//     * Method @Descreption  TODO 增加描述
//     *
//     *
//     * @param queryModel
//     * @param destination
//     *
//     * @return  ResultModel
//     */
//    @RequestMapping(
//        value = "/listConsumers/all",
//        method = RequestMethod.POST
//    )
//    public List<Subscriber> listAllConsumers(@RequestParam("queryModel") String queryModel,
//                                             @RequestParam("destination") String destination) {
//        return null;
//    }
//
//    /**
//     * Method @Descreption  TODO 增加描述
//     *
//     *
//     * @param queryModel
//     * @param destination
//     *
//     * @return  ResultModel
//     */
//    @RequestMapping(
//        value = "/listConsumers/durable",
//        method = RequestMethod.POST
//    )
//    public List<Subscriber> listDurableConsumers(@RequestParam("queryModel") String queryModel,
//                                                 @RequestParam("destination") String destination) {
//        return null;
//    }
//
//    /**
//     * Method @Descreption  TODO 增加描述
//     *
//     *
//     * @param queryModel
//     * @param destination
//     *
//     * @return  ResultModel
//     */
//    @RequestMapping(
//        value = "/listConsumers/non_durable",
//        method = RequestMethod.POST
//    )
//    public List<Subscriber> listNon_durableConsumers(@RequestParam("queryModel") String queryModel,
//                                                     @RequestParam("destination") String destination) {
//        return null;
//    }
//
//    /**
//     * Method @Descreption  TODO 增加描述
//     *
//     *
//     * @param queryModel
//     * @param destination
//     *
//     * @return  ResultModel
//     */
//    @RequestMapping(
//        value = "/listProducers",
//        method = RequestMethod.POST
//    )
//    public List<Producer> listProducers(@RequestParam("queryModel") String queryModel,
//                                        @RequestParam("destination") String destination) {
//        return null;
//    }
//
//    /**
//     * Method @Descreption  TODO 增加描述
//     *
//     *
//     * @param queryModel
//     *
//     * @return  ResultModel
//     */
//    @RequestMapping(
//        value = "/listTopics",
//        method = RequestMethod.POST
//    )
//    public List<Topic> listTopics(@RequestParam("queryModel") String queryModel) {
//        return null;
//    }
//}
//
//
////~ Formatted by Jindent --- http://www.jindent.com
