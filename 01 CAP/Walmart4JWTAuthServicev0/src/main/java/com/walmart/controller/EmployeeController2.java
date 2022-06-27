package com.walmart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//restful web service
@RestController
@RequestMapping("/api")
public class EmployeeController2 {

	@GetMapping("welcomeString")
	public String welcome() {
		return "Welcome to EMS";
	}

	@GetMapping("welcomeHTML")
	public String welcomeHTML() {
		return "<h1 style='color:red'>Welcome to EMS</h1>";
	}

}
