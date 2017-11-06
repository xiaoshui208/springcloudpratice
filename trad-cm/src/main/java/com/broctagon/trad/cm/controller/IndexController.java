
package com.broctagon.trad.cm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* @auther: Water
* @time: Oct 30, 2017 12:28:06 PM
* 
*/

@Controller
public class IndexController {

	@RequestMapping("/")
	@ResponseBody
	public String index(){
		
		return "trad-cm index";
	}
	
}
