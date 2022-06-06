package com.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class D2SbAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(D2SbAopApplication.class, args);
	}

}
