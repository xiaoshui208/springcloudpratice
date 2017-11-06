
package com.broctagon.trad.mgsg.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
* @auther: Water
* @time: Oct 30, 2017 8:09:55 PM
* 
*/

@FeignClient(name = "trad-cm" )
public interface CmFeignClient {

	@RequestMapping(value = "/gettraderlist", method = RequestMethod.GET)
	public String getTraderList();
	
}
