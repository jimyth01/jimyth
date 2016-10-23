package org.jimyth.business.app.controller;

import com.google.gson.JsonObject;
import org.apache.log4j.Logger;
import org.jimyth.business.exception.BusinessException;
import org.jimyth.xcode.jms.activemq.ActivemqSpringProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.portlet.ModelAndView;

import javax.jms.JMSException;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author songjian @Mar 3, 2013
 */

@Controller
@RequestMapping(value="/jms")
public class JmsController {

	private Logger LOG = Logger.getLogger(getClass());

	@Autowired
	@Qualifier("jms_proxy")
	private ActivemqSpringProxy proxy;

	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String testjms(){
		return "jms/index";
	}


	@RequestMapping(value="/websocket",method=RequestMethod.GET)
	public String testwebsocket(){
		return "websocket/echo";
	}

	@ResponseBody
	@RequestMapping(value="/send",method=RequestMethod.GET)
	public  Object sendFromGET(@RequestParam("name") String name,
							   @RequestParam("msg") String message){
		Map<String,Object> map = new HashMap<String,Object>();
		proxy.sendMessage(name,message);
		JsonObject object = new JsonObject();
		map.put("success", Boolean.TRUE);
		map.put("items", "123");
		map.put("status", 0);
		return map;
	}

	@ResponseBody
	@RequestMapping(value="/receive",method=RequestMethod.GET)
	public  Object receiveFromMQ(@RequestParam("name") String name){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			String ccd = proxy.receiveMessage(name);
			map.put("message", ccd);
			LOG.debug("get jms message "+ccd);
		} catch (JMSException e) {
			try {
				throw new BusinessException("JMS 接收出错..");
			} catch (BusinessException e1) {
				e1.printStackTrace();
			}
		}
		proxy.sendMessage("hello world！");
		map.put("success", Boolean.TRUE);

		map.put("status", 0);
//		map.put("model", model);
		ModelAndView mav=new ModelAndView("products/list",map);
		return map;
	}


	@RequestMapping(value="/getjms",method=RequestMethod.GET)
	public void getTxt() throws BusinessException{
		try {
			String ccd = proxy.receiveMessage();
			LOG.debug("get jms message "+ccd);
		} catch (JMSException e) {
			throw new BusinessException("JMS 接收出错..");
		}
	}

}
