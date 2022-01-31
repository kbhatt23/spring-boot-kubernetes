package com.learning.userservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	//here we are using system.outt.println for console output
	@Value("${test.message}")
	private String message;
	
	//default page
	@GetMapping
	public String test() {
		System.out.println("TestController: test api called for user service");
		return message;
	}
}
