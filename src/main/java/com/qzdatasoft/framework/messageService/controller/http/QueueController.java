package com.qzdatasoft.framework.messageService.controller.http;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
 * 队列维护以及收发消息
 * @author jimyth
 * @version V1.0, 2016.10.23 at 03:02:11 CST
 */
@Controller
@RequestMapping(value = "/mq/v1/queue")
public class QueueController {

    /**
     *
     */
    private static final String DEFAULT_SORT_COLUMNS = "";

    /**
     * 创建新的队列
     * @param JMSDestination 队列的名称
     * @return 创建成功返回(errorcode)
     */
    @ApiVersion(1)
    @ApiKey(
            IsNew = false,
            Version = 1,
            ProjectCode = "message",
            GroupCode = "http",
            ApiCode = "queue",
            ApiDescribe = "创建新的队列",
            URL = "/mq/{version}/queue/create",
            Method = "POST",
            DataHead = "",
            Data = "",
            Param = "JMSDestination:String:队列名称"
    )
    @RequestMapping(
            value = "/create",
            method = RequestMethod.GET
    )
    public ReturnMessageInfo create(@RequestParam("JMSDestination") String JMSDestination) {
        ReturnMessageInfo result = new ReturnMessageInfo();
        result.setErrorCode(Constants.ERROE_CODE_SUCCESS);
        result.setData("success");
//        result = new ReturnMessageInfo(Constants.ERROE_CODE_SUCCESS);

        return result;
    }

    /**
     * 删除消息
     * @param messageId 消息的ID
     * @return 删除成功返回(errorcode)
     */
    @ApiVersion(1)
    @ApiKey(
            IsNew = false,
            Version = 1,
            ProjectCode = "message",
            GroupCode = "http",
            ApiCode = "queue",
            ApiDescribe = "删除消息",
            URL = "/mq/{version}/queue/deleteMessage",
            Method = "DELETE",
            DataHead = "",
            Data = "",
            Param = "messageId:String:消息Id"
    )
    @RequestMapping(
            value = "/deleteMessage",
            method = RequestMethod.DELETE
    )
    public ReturnMessageInfo deleteMessage(@RequestParam("messageId") String messageId) {
        ReturnMessageInfo result;

        result = new ReturnMessageInfo(Constants.ERROE_CODE_SUCCESS);

        return result;
    }

    /**
     * 删除队列
     * @param JMSDestination 队列的名称
     * @return 删除成功返回(errorcode)
     */
    @ApiVersion(1)
    @ApiKey(
            IsNew = false,
            Version = 1,
            ProjectCode = "message",
            GroupCode = "http",
            ApiCode = "queue",
            ApiDescribe = "删除队列",
            URL = "/mq/{version}/queue/deleteQueue",
            Method = "DELETE",
            DataHead = "",
            Data = "",
            Param = "JMSDestination:String:队列名称"
    )
    @RequestMapping(
            value = "/deleteQueue",
            method = RequestMethod.DELETE
    )
    public ReturnMessageInfo deleteQueue(@RequestParam("JMSDestination") String JMSDestination) {
        ReturnMessageInfo result;

        result = new ReturnMessageInfo(Constants.ERROE_CODE_SUCCESS);

        return result;
    }

    /**
     * 获取JMSDestination队列当前在线的所有的消费者
     * @param JMSDestination 队列名称
     * @param conditions     查询条件(JSON)
     * @param pagenumber     页码
     * @param pagesize       页面大小
     * @param derection      排序
     * @param orderby        排序字段
     * @return 成功返回消费者个数(errorcode)和消费者(data)
     */
    @ApiVersion(1)
    @ApiKey(
            IsNew = false,
            Version = 1,
            ProjectCode = "message",
            GroupCode = "http",
            ApiCode = "queue",
            ApiDescribe = "获取队列当前在线的所有的消费者，根据给定的条件查询数据，目前只支持单字段排序",
            URL = "/mq/{version}/queue/listConsumers",
            Method = "GET",
            DataHead = "",
            Data = "",
            Param = "JMSDestination:String队列名称,conditions:String:查询条件(JSON),pagenumber:Integer:页码,pagesize:Integer:页面大小,derection:String:排序:ASC|DESC,orderby:String:排序字段"
    )
    @RequestMapping(
            value = "/listConsumers",
            method = RequestMethod.GET
    )
    public ReturnMessageInfo listConsumers(@RequestParam("JMSDestination") String JMSDestination, @RequestParam(
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
        ReturnMessageInfo result;

        try {
            String[] _orderBy = orderby.split(",");
            Sort sort = new Sort(Sort.Direction.ASC, _orderBy);
            Pageable pageable = new PageRequest(pagenumber, pagesize, sort);

            // List<Lox> data= service.List(pageable);
            List<?> data = new ArrayList<String>();

            result = new ReturnMessageInfo(Constants.ERROE_CODE_SUCCESS, data);
        } catch (Exception e) {
            result = new ReturnMessageInfo(e.getClass().getName(), e.getMessage());
        }

        return result;
    }

    /**
     * 获取JMSDestination队列的消息
     * @param JMSDestination 队列的名称
     * @param conditions     查询条件(JSON)
     * @param pagenumber     页码
     * @param pagesize       页面大小
     * @param derection      排序
     * @param orderby        排序字段
     * @return 成功返回消息条数(errorcode)和消息(data)
     */
    @ApiVersion(1)
    @ApiKey(
            IsNew = false,
            Version = 1,
            ProjectCode = "message",
            GroupCode = "http",
            ApiCode = "queue",
            ApiDescribe = "获取队列的消息，根据给定的条件查询数据，目前只支持单字段排序",
            URL = "/mq/{version}/queue/listMessages",
            Method = "GET",
            DataHead = "",
            Data = "",
            Param = "JMSDestination:String队列名称,conditions:String:查询条件(JSON),pagenumber:Integer:页码,pagesize:Integer:页面大小,derection:String:排序:ASC|DESC,orderby:String:排序字段"
    )
    @ResponseBody
    @RequestMapping(
            value = "/listMessages",
            method = RequestMethod.GET
    )
    public ReturnMessageInfo listMessages(@RequestParam("JMSDestination") String JMSDestination, @RequestParam(
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
        ReturnMessageInfo result;

        try {
            String[] _orderBy = orderby.split(",");
            Sort sort = new Sort(Sort.Direction.ASC, _orderBy);
            Pageable pageable = new PageRequest(pagenumber, pagesize, sort);

            // List<Lox> data= service.List(pageable);
            List<?> data = new ArrayList<String>();

            result = new ReturnMessageInfo(Constants.ERROE_CODE_SUCCESS, data);
        } catch (Exception e) {
            result = new ReturnMessageInfo(e.getClass().getName(), e.getMessage());
        }

        return result;
    }

    /**
     * 获取JMSDestination队列当前在线的所有的生产者
     * @param JMSDestination 队列名称
     * @param conditions     查询条件(JSON)
     * @param pagenumber     页码
     * @param pagesize       页面大小
     * @param derection      排序
     * @param orderby        排序字段
     * @return 成功返回消息条数(errorcode)和生产者(data)
     */
    @ApiVersion(1)
    @ApiKey(
            IsNew = false,
            Version = 1,
            ProjectCode = "message",
            GroupCode = "http",
            ApiCode = "queue",
            ApiDescribe = "获取队列当前在线的所有的生产者，根据给定的条件查询数据，目前只支持单字段排序",
            URL = "/mq/{version}/queue/listProducers",
            Method = "GET",
            DataHead = "",
            Data = "",
            Param = "JMSDestination:String队列名称,conditions:String:查询条件(JSON),pagenumber:Integer:页码,pagesize:Integer:页面大小,derection:String:排序:ASC|DESC,orderby:String:排序字段"
    )
    @ResponseBody
    @RequestMapping(
            value = "/listProducers",
            method = RequestMethod.GET
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
        ReturnMessageInfo result;

        try {
            String[] _orderBy = orderby.split(",");
            Sort sort = new Sort(Sort.Direction.ASC, _orderBy);
            Pageable pageable = new PageRequest(pagenumber, pagesize, sort);

            // List<Lox> data= service.List(pageable);
            List<?> data = new ArrayList<String>();

            result = new ReturnMessageInfo(Constants.ERROE_CODE_SUCCESS, data);
        } catch (Exception e) {
            result = new ReturnMessageInfo(e.getClass().getName(), e.getMessage());
        }

        return result;
    }

    /**
     * Method  获取所有的队列
     * @param conditions 查询条件(JSON)
     * @param pagenumber 页码
     * @param pagesize   页面大小
     * @param derection  排序
     * @param orderby    排序字段
     * @return 成功返回队列个数(errorcode)和队列(data)
     */
    @ApiVersion(1)
    @ApiKey(
            IsNew = false,
            Version = 1,
            ProjectCode = "message",
            GroupCode = "http",
            ApiCode = "queue",
            ApiDescribe = "获取所有的队列，根据给定的条件查询数据，目前只支持单字段排序",
            URL = "/mq/{version}/queue/listQueues",
            Method = "GET",
            DataHead = "",
            Data = "",
            Param = "conditions:String:查询条件(JSON),pagenumber:Integer:页码,pagesize:Integer:页面大小,derection:String:排序:ASC|DESC,orderby:String:排序字段"
    )
    @ResponseBody
    @RequestMapping(
            value = "/listQueues",
            method = RequestMethod.GET
    )
    public ReturnMessageInfo listQueues(@RequestParam(
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
        ReturnMessageInfo result;

        try {
            String[] _orderBy = orderby.split(",");
            Sort sort = new Sort(Sort.Direction.ASC, _orderBy);
            Pageable pageable = new PageRequest(pagenumber, pagesize, sort);

            // List<Lox> data= service.List(pageable);
            List<?> data = new ArrayList<String>();

            result = new ReturnMessageInfo(Constants.ERROE_CODE_SUCCESS, data);
        } catch (Exception e) {
            result = new ReturnMessageInfo(e.getClass().getName(), e.getMessage());
        }

        return result;
    }

    /**
     * 清除队列中未消费的消息，将其置为已消费
     * @param JMSDestination 队列名称
     * @return 清理成功返回(errorcode)
     */
    @ApiVersion(1)
    @ApiKey(
            IsNew = false,
            Version = 1,
            ProjectCode = "message",
            GroupCode = "http",
            ApiCode = "queue",
            ApiDescribe = "清除队列中未消费的消息，将其置为已消费",
            URL = "/mq/{version}/queue/purge",
            Method = "DELETE",
            DataHead = "",
            Data = "",
            Param = "JMSDestination:String队列名称,conditions:String:查询条件(JSON),pagenumber:Integer:页码,pagesize:Integer:页面大小,derection:String:排序:ASC|DESC,orderby:String:排序字段"
    )
    @ResponseBody
    @RequestMapping(
            value = "/purge",
            method = RequestMethod.DELETE
    )
    public ReturnMessageInfo purge(@RequestParam("JMSDestination") String JMSDestination) {
        return null;
    }

    /**
     * 同步接收一条消息
     * @param JMSDestination 队列名称
     * @return 清理成功返回(errorcode)和消息(data)
     */
    @ApiVersion(1)
    @ApiKey(
            IsNew = false,
            Version = 1,
            ProjectCode = "message",
            GroupCode = "http",
            ApiCode = "queue",
            ApiDescribe = "接收一条消息",
            URL = "/mq/{version}/queue/receive",
            Method = "GET",
            DataHead = "",
            Data = "",
            Param = "JMSDestination:String队列名称"
    )
    @ResponseBody
    @RequestMapping(
            value = "/receive",
            method = RequestMethod.GET
    )
    public ReturnMessageInfo receive(@RequestParam("JMSDestination") String JMSDestination) {
        return null;
    }

    /**
     * 发送文本消息
     * @param JMSDestination 队列名称
     * @param message        消息内容
     * @return 成功返回发送结果(errorcode)
     */
    @ApiVersion(1)
    @ApiKey(
            IsNew = false,
            Version = 1,
            ProjectCode = "message",
            GroupCode = "http",
            ApiCode = "queue",
            ApiDescribe = "发送文本消息",
            URL = "/mq/{version}/queue/send",
            Method = "POST",
            DataHead = "",
            Data = "",
            Param = "JMSDestination:String队列名称,message:String:消息内容"
    )
    @ResponseBody
    @RequestMapping(
            value = "/send",
            method = RequestMethod.POST
    )
    public ReturnMessageInfo send(@RequestParam("JMSDestination") String JMSDestination,
                                  @RequestParam("message") String message) {
        return null;
    }

    /**
     * 根据消息ID查看消息
     * @param JMSDestination 队列名称
     * @param messageId      消息的Id
     * @return 成功返回(errorcode)和消息(data)
     */
    @ApiVersion(1)
    @ApiKey(
            IsNew = false,
            Version = 1,
            ProjectCode = "message",
            GroupCode = "http",
            ApiCode = "queue",
            ApiDescribe = "根据消息ID查看消息",
            URL = "/mq/{version}/queue/viewMessage",
            Method = "GET",
            DataHead = "",
            Data = "",
            Param = "JMSDestination:String队列名称,messageId:String:消息Id"
    )
    @ResponseBody
    @RequestMapping(
            value = "/viewMessage",
            method = RequestMethod.GET
    )
    public ReturnMessageInfo viewMessage(@RequestParam("JMSDestination") String JMSDestination,
                                         @RequestParam("messageId") String messageId) {
        return null;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
