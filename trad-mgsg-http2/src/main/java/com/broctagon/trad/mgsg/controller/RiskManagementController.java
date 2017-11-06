
package com.broctagon.trad.mgsg.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
* @auther: Water
* @time: Oct 31, 2017 8:25:50 PM
* 
*/

@Controller
public class RiskManagementController {
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="getAllOpenPositionFallback")
	@RequestMapping("/rm/{url}")
	@ResponseBody
	public String getAllOpenPosition(@PathVariable String url){
		logger.info("getAllOpenPosition,url:" + url);
		String str = restTemplate.getForObject("http://trad-rm-http/" + url, String.class);
		logger.info("str:" + str);
		return str;
	}
	
	public String getAllOpenPositionFallback(String url){
		return "getAllOpenPosition, end";
	}

}
