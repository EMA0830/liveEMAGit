package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class D2MicroServiceProductsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(D2MicroServiceProductsServiceApplication.class, args);
	}

}
