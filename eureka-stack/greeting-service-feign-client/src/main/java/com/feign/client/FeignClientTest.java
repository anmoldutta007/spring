package com.feign.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
public class FeignClientTest {

	@Autowired
    private GreetingClient greetingClient;
	
	@Autowired
	private EurekaClient discoveryClient;
 
    public static void main(String[] args) {
        SpringApplication.run(FeignClientTest.class, args);
    }
    
    @RequestMapping("/greetings-123")
    public String greeting() {
        return greetingClient.greeting();
    }

}
