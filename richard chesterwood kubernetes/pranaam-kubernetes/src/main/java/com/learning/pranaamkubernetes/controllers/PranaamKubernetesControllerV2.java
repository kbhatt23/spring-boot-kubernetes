package com.learning.pranaamkubernetes.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pranaam-kubernetes")
public class PranaamKubernetesControllerV2 {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PranaamKubernetesControllerV2.class);
	
	@GetMapping
	public String pranaamDocker() {
		LOGGER.info("PranaamDocker called");
		return "Pranaam Docker";
	}
	
	@GetMapping("/{name}")
	public String pranaamDocker(@PathVariable String name) {
		LOGGER.info("pranaamDocker called by user: "+name);
		return "Pranaam Docker says "+name;
	}
}
