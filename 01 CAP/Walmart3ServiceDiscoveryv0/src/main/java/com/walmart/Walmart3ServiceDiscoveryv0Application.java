package com.walmart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class Walmart3ServiceDiscoveryv0Application {

	public static void main(String[] args) {
		SpringApplication.run(Walmart3ServiceDiscoveryv0Application.class, args);
	}

}
