package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {
// return string

	@GetMapping("/string")
	public String welcomeString() {
		return "Welcome";
	}
	@GetMapping("/html")
	public String welcomeHTML() {
		String htmlFormString = "<html>"
				+ "<body>"
				+ "<h1>Welcome</h1>"
				+ "<ul><li>Red</li><li>Blue</li><li>Green</li></ul>"
				+ "</body>"
				+ "</html>";
		return htmlFormString;
	}
}

