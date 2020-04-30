package com.learning.kubernetes.springbootmysqlclient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
	private static final Logger LOGGER = LoggerFactory.getLogger(HealthCheckController.class);
	@RequestMapping("/")
	public String monitor() {
		LOGGER.info("jai shree ram from docker monitor using logger");
		System.out.println("jai shree ram from docker monitor using println");
		return "jai shreee ram from docker";
	}
}
