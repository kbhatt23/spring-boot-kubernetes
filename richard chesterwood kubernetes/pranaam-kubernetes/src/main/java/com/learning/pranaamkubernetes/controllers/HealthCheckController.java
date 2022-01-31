package com.learning.pranaamkubernetes.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckController {

	private static final Logger LOGGER = LoggerFactory.getLogger(HealthCheckController.class);

	@GetMapping
	public String healthCheck() {
		LOGGER.info("healthCheck called");
		return "status ok";
	}
}
