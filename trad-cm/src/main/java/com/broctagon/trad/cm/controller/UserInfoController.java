
package com.broctagon.trad.cm.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* @auther: Water
* @time: Oct 30, 2017 12:29:27 PM
* 
*/

@Controller
public class UserInfoController {
	
	private Logger logger = Logger.getLogger(this.getClass());

	@RequestMapping("/gettraderlist")
	@ResponseBody
	public String getTraderList(){
		logger.info("getTraderList.");
		return "traderlist:";
	}
}
