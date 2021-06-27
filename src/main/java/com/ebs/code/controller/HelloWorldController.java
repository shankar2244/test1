package com.ebs.code.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/api")
public class HelloWorldController {
	
	@GetMapping(path = "/hello")
	public String sayHelloWorld() {
		return "Hello Saroj, How are you 10001?";
	}
}
