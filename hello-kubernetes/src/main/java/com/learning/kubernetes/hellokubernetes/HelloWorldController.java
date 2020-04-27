package com.learning.kubernetes.hellokubernetes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-kubernetes")
public class HelloWorldController {
	@Autowired
	private InstanceInformationService service;
	
	@GetMapping("/test")
	public String test() {
		System.out.println("jai shreee ram from docker test");
		return "jai shreee ram "+ "V3 : "+service.retrieveInstanceInfo();
	}


}
