/**Copyright: Copyright (c) 2016, 湖南强智科技发展有限公司*/
package com.qzdatasoft.message.controller;

import java.util.ArrayList;
import java.util.List;

import com.qzdatasoft.message.pojo.Lox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qzdatasoft.framework.annotation.ApiKey;
import com.qzdatasoft.framework.common.Constants;
import com.qzdatasoft.framework.common.ReturnMessageDataList;
import com.qzdatasoft.framework.common.ReturnMessageInfo;
import com.qzdatasoft.framework.common.annotation.apiversion.ApiVersion;

/**
 * 控制类：这是一个测试类<br>
 * History:<br> 
 *    . 1.0.0.20160913, com.qzdatasoft.koradji, Added: 增加注释<br>
 *    . 1.0.0.20160910, com.qzdatasoft.koradji, Create<br>
 */
@RestController
@RequestMapping("/api/{version}/lox")
public class loxController {

	 private static final String DEFAULT_SORT_COLUMNS = "";
	 
//	 @Autowired
//	 private LoxService service;
	 
	/**
	 * 根据id获取记录
	 * @param id
	 * @return 成功返回记录条数(errorcode)和记录(data)
	 */
    @ApiVersion(1)
	@ApiKey(IsNew=false,Version=1,ProjectCode="example",GroupCode="lox",
			ApiCode="lox",ApiDescribe="获取一条数据",URL="/api/{version}/lox/{id}",Method="GET",
			DataHead="{'loxId':'编码','pd':'名称'}",Data="{'loxId':'1','pd':'ddddd'}",Param="id:String:记录唯一ID")
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ReturnMessageInfo detail(/*@PathVariable(value="id")*/ String id){
		ReturnMessageInfo result;

		Lox data;
		data= new Lox(); data.setName("zhouzq");data.setRemark("sasql");
		//data= service.get(id);
		ReturnMessageDataList ds=
				new ReturnMessageDataList(0,data);
		result=new ReturnMessageInfo(Constants.ERROE_CODE_SUCCESS, ds);

		return result;
	}
		 
	/**
	 * 列表
	 * @param id
	 * @return
	 */
    @ApiVersion(1)
	@ApiKey(Version=1,ProjectCode="example",GroupCode="lox",
			ApiCode="lox",ApiDescribe="根据给定的条件查询数据，目前只支持单字段排序",URL="/api/{version}/lox/sesrch",Method="GET",
			DataHead="{'loxId':'编码','pd':'名称'}",Data="{'loxId':'1','pd':'ddddd'}",
			Param="conditions:String:查询条件(JSON),pagenumber:Integer:页码,pagesize:Integer:页面大小,derection:String:排序:ASC|DESC,orderby:String:排序字段")
	@RequestMapping(value="/sesrch", method=RequestMethod.POST)
	public ReturnMessageInfo list(
			@RequestParam(value="conditions", defaultValue=Constants.CURRENT_PAGE_DEFAULT_STR) String conditions,
			@RequestParam(value="pagenumber", defaultValue=Constants.CURRENT_PAGE_DEFAULT_STR) int pagenumber,
			@RequestParam(value="pagesize",  defaultValue=Constants.PAGESIZE_DEFAULT_STR) int pagesize,
			@RequestParam(value="derection",  defaultValue="ASC") int derection,
			@RequestParam(value="orderby",  defaultValue=DEFAULT_SORT_COLUMNS) String orderby
			){
		
		ReturnMessageInfo result;
		try{
			String[] _orderBy=orderby.split(",");
			Sort sort=new Sort(Direction.ASC, _orderBy);
			Pageable pageable = new PageRequest(pagenumber,pagesize,sort);
			//List<Lox> data= service.List(pageable);
			List<Lox> data= new ArrayList<Lox>();
			result=new ReturnMessageInfo(Constants.ERROE_CODE_SUCCESS, data);
		}catch(Exception e)	{
			result=new ReturnMessageInfo(e.getClass().getName(), e.getMessage());
		}

		return result;
	}

	/**
	 * 新增一批记录，要么全部成功，要么全部失败
	 * @param loxs
	 * @return 增加成功的记录数和增加成功的记录(data)
	 */
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public ReturnMessageInfo post(List<Lox> loxs){
		return null;
	}

	/**
	 * 根据唯一ID删除一批记录，要么全部成功，要么全部失败
	 * @param ids
	 * @return 删除成功的记录条数(errorcode)
	 */
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public ReturnMessageInfo delete(List<String> ids){
		return null;
	}
	
	/**
	 * 更新一批记录，要么全部成功，要么全部失败
	 * @param loxs
	 * @return 更新成功的记录数(errorCode)和更新成功的记录(data)
	 */
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public ReturnMessageInfo put(List<Lox> loxs){
		return null;
	}



}
