package com.walmart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class Walmart2ApiGatewayv0Application {

	public static void main(String[] args) {
		SpringApplication.run(Walmart2ApiGatewayv0Application.class, args);
	}

}
