package com.learning.kubernetes.hellokubernetes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/hello-kubernetes")
public class HelloWorldController {
	@Autowired
	private InstanceInformationService service;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HealthCheckController.class);
	
	@GetMapping("/test")
	public String test() {
		LOGGER.info("jai shree ram from docker test using logger");
		System.out.println("jai shree ram from docker test using println");
		return "jai shreee ram "+ "V6 : "+service.retrieveInstanceInfo();
	}


}
