package org.jimyth.messageService.http.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qzdatasoft.framework.annotation.ApiKey;
import com.qzdatasoft.framework.common.Constants;
import com.qzdatasoft.framework.common.ReturnMessageInfo;
import com.qzdatasoft.framework.common.annotation.apiversion.ApiVersion;

/**
 * Class TopicController      主题维护
 *
 * @author jimyth
 * @version V1.0, 2016.10.23 at 03:08:59 CST
 */
@Controller
@RequestMapping(value = "/mq/{version}/")
public class TopicController {

    /**
     *
     */
    private static final String DEFAULT_SORT_COLUMNS = "";

    /**
     * 创建主题
     *
     * @param JMSDestination 主题名称
     * @return 创建成功返回(errorcode)
     */
    @ApiVersion(1)
    @ApiKey(
        IsNew = false,
        Version = 1,
        ProjectCode = "message",
        GroupCode = "http",
        ApiCode = "queue",
        ApiDescribe = "创建主题",
        URL = "/mq/{version}/topic/createTopic",
        Method = "POST",
        DataHead = "{'JMSDestination':'主题名称'}",
        Data = "{'JMSDestination':'testTopic'}",
        Param = "JMSDestination:String:主题名称"
    )
    @ResponseBody
    @RequestMapping(
        value = "/createTopic",
        method = RequestMethod.POST
    )
    public ReturnMessageInfo createTopic(@RequestParam("JMSDestination") String JMSDestination) {
        return null;
    }

    /**
     * 删除主题
     *
     * @param JMSDestination 主题名称
     * @return 删除成功返回(errorcode)
     */
    @ApiVersion(1)
    @ApiKey(
        IsNew = false,
        Version = 1,
        ProjectCode = "message",
        GroupCode = "http",
        ApiCode = "queue",
        ApiDescribe = "删除主题",
        URL = "/mq/{version}/topic/deleteTopic",
        Method = "POST",
        DataHead = "{'JMSDestination':'主题名称'}",
        Data = "{'JMSDestination':'testTopic'}",
        Param = "JMSDestination:String:主题名称"
    )
    @ResponseBody
    @RequestMapping(
        value = "/deleteTopic",
        method = RequestMethod.POST
    )
    public ReturnMessageInfo deleteTopic(@RequestParam("JMSDestination") String JMSDestination) {
        return null;
    }

    /**
     * 列出当前主题所有的在线的生产者
     *
     * @param JMSDestination 主题的名称
     * @param conditions     查询条件(JSON)
     * @param pagenumber     页码
     * @param pagesize       页面大小
     * @param derection      排序
     * @param orderby        排序字段
     * @return 成功返回生产者者个数(errorcode)和生产者(data)
     */
    @ApiVersion(1)
    @ApiKey(
        IsNew = false,
        Version = 1,
        ProjectCode = "message",
        GroupCode = "http",
        ApiCode = "queue",
        ApiDescribe = "查看当前主题的所有的订阅者",
        URL = "/mq/{version}/topic/listProducers",
        Method = "POST",
        DataHead = "{'JMSDestination':'主题名称'}",
        Data = "{'JMSDestination':'testTopic'}",
        Param = "JMSDestination:String:主题名称,conditions:String:查询条件(JSON),pagenumber:Integer:页码,pagesize:Integer:页面大小,derection:String:排序:ASC|DESC,orderby:String:排序字段"
    )
    @ResponseBody
    @RequestMapping(
        value = "/listProducers",
        method = RequestMethod.POST
    )
    public ReturnMessageInfo listProducers(@RequestParam("JMSDestination") String JMSDestination, @RequestParam(
        value = "conditions",
        defaultValue = Constants.CURRENT_PAGE_DEFAULT_STR
    ) String conditions, @RequestParam(
        value = "pagenumber",
        defaultValue = Constants.CURRENT_PAGE_DEFAULT_STR
    ) int pagenumber, @RequestParam(
        value = "pagesize",
        defaultValue = Constants.PAGESIZE_DEFAULT_STR
    ) int pagesize, @RequestParam(
        value = "derection",
        defaultValue = "ASC"
    ) int derection, @RequestParam(
        value = "orderby",
        defaultValue = DEFAULT_SORT_COLUMNS
    ) String orderby) {
        return null;
    }

    /**
     * 查看当前主题的所有的订阅者
     *
     * @param JMSDestination 主题名称
     * @param SubscriberType 订阅类型
     * @param conditions     查询条件(JSON)
     * @param pagenumber     页码
     * @param pagesize       页面大小
     * @param derection      排序
     * @param orderby        排序字段
     * @return 成功返回订阅者者个数(errorcode)和订阅者(data)
     */
    @ApiVersion(1)
    @ApiKey(
        IsNew = false,
        Version = 1,
        ProjectCode = "message",
        GroupCode = "http",
        ApiCode = "queue",
        ApiDescribe = "查看当前主题的所有的订阅者",
        URL = "/mq/{version}/topic/listSubscribers",
        Method = "POST",
        DataHead = "{'JMSDestination':'主题名称','SubscriberType':'订阅者类型'}",
        Data = "{'JMSDestination':'testTopic','SubscriberType':'durable'}",
        Param = "SubscriberType:String:订阅类型，包括all 所有,durable 持久,non_durable 非持久  ,JMSDestination:String:主题名称,conditions:String:查询条件(JSON),pagenumber:Integer:页码,pagesize:Integer:页面大小,derection:String:排序:ASC|DESC,orderby:String:排序字段"
    )
    @ResponseBody
    @RequestMapping(
        value = "/listSubscribers",
        method = RequestMethod.POST
    )
    public ReturnMessageInfo listSubscribers(@RequestParam("JMSDestination") String JMSDestination,
                                             @RequestParam("SubscriberType") String SubscriberType, @RequestParam(
        value = "conditions",
        defaultValue = Constants.CURRENT_PAGE_DEFAULT_STR
    ) String conditions, @RequestParam(
        value = "pagenumber",
        defaultValue = Constants.CURRENT_PAGE_DEFAULT_STR
    ) int pagenumber, @RequestParam(
        value = "pagesize",
        defaultValue = Constants.PAGESIZE_DEFAULT_STR
    ) int pagesize, @RequestParam(
        value = "derection",
        defaultValue = "ASC"
    ) int derection, @RequestParam(
        value = "orderby",
        defaultValue = DEFAULT_SORT_COLUMNS
    ) String orderby) {
        return null;
    }

    /**
     * 获取所有的主题列表
     *
     * @param conditions 查询条件(JSON)
     * @param pagenumber 页码
     * @param pagesize   页面大小
     * @param derection  排序
     * @param orderby    排序字段
     * @return 成功返回主题个数(errorcode)和主题(data)
     */
    @ApiVersion(1)
    @ApiKey(
        IsNew = false,
        Version = 1,
        ProjectCode = "message",
        GroupCode = "http",
        ApiCode = "queue",
        ApiDescribe = "查看当前主题的所有的订阅者",
        URL = "/mq/{version}/topic/listTopics",
        Method = "POST",
        DataHead = "{'JMSDestination':'主题名称'}",
        Data = "{'JMSDestination':'testTopic'}",
        Param = "conditions:String:查询条件(JSON),pagenumber:Integer:页码,pagesize:Integer:页面大小,derection:String:排序:ASC|DESC,orderby:String:排序字段"
    )
    @ResponseBody
    @RequestMapping(
        value = "/listTopics",
        method = RequestMethod.POST
    )
    public ReturnMessageInfo listTopics(@RequestParam(
        value = "conditions",
        defaultValue = Constants.CURRENT_PAGE_DEFAULT_STR
    ) String conditions, @RequestParam(
        value = "pagenumber",
        defaultValue = Constants.CURRENT_PAGE_DEFAULT_STR
    ) int pagenumber, @RequestParam(
        value = "pagesize",
        defaultValue = Constants.PAGESIZE_DEFAULT_STR
    ) int pagesize, @RequestParam(
        value = "derection",
        defaultValue = "ASC"
    ) int derection, @RequestParam(
        value = "orderby",
        defaultValue = DEFAULT_SORT_COLUMNS
    ) String orderby) {
        return null;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
