package com.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("greeting-service")
public interface GreetingClient {
	@RequestMapping("/greeting")
	String greeting();
}
