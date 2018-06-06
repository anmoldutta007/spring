package com.spring.cloud.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
		@Value("${server.port}")
		int port;
		
		@RequestMapping("/greeting")
		public String greeting(){
			
			return "Hello From Greeting Eureka Client running on port " + this.port;
		}
}
