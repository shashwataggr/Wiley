package com.shashwat.mygateway.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MygatewayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MygatewayApiApplication.class, args);
	}

}
