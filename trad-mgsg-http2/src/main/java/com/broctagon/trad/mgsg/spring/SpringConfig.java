
package com.broctagon.trad.mgsg.spring;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
* @auther: Water
* @time: Oct 30, 2017 5:32:43 PM
* 
*/

@Configuration
public class SpringConfig {

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
	
}
