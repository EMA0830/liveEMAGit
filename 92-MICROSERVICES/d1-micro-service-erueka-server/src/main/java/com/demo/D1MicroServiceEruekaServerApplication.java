package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class D1MicroServiceEruekaServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(D1MicroServiceEruekaServerApplication.class, args);
	}
}
