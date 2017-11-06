
package com.broctagon.trad.mgsg.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.broctagon.trad.mgsg.feign.CmFeignClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
* @auther: Water
* @time: Oct 30, 2017 12:29:27 PM
* 
*/

@Controller
public class UserInfoController {
	
	private Logger logger = Logger.getLogger(this.getClass());

	@Autowired
	private RestTemplate restTemplate;
	
/*	@Autowired
	private CmFeignClient cmFeigClient;*/
	
	@HystrixCommand(fallbackMethod="getTraderListFallback")
	@RequestMapping("/cm/{url}")
	@ResponseBody
	public String getTraderList(@PathVariable String url){
		logger.info("url." + url);
		String str = restTemplate.getForObject("http://trad-cm/" + url, String.class);
		logger.info("str:" + str);
		return str;
	}
	
	@HystrixCommand(fallbackMethod="getTraderListFallback")
	@RequestMapping("/rm/{url}")
	@ResponseBody
	public String getAllOpenPosition(@PathVariable String url){
		logger.info("getAllOpenPosition,url:" + url);
		String str = restTemplate.getForObject("http://trad-cm/" + url, String.class);
		logger.info("str:" + str);
		return str;
	}
	
	public String getTraderListFallback(String url){
		return "getTraderListFallback, end";
	}
	
/*	@RequestMapping("/cm/{url}")
	@ResponseBody
	public String getTraderList(@PathVariable String url){
		logger.info("url." + url);
		if("gettraderlist".equalsIgnoreCase(url)){
			String str = cmFeigClient.getTraderList();
			logger.info("str:" + str);
			return str;
		}
		else{
			return "error";
		}
	}*/
	
}
