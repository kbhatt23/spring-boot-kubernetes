package com.learning.pranaam_docker.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pranaam-docker")
public class PranaamDockerController {

	//instead of print ln
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@GetMapping()
	public String pranaamDocker() {
		logger.info("pranaamDocker: pranaam docker called");
		return "pranaam docker";
	}
	
	@GetMapping("/{user}")
	public String pranaamDockerSays(@PathVariable String user) {
		logger.info("pranaamDockerSays: pranaam docker called for user "+user);
		return "pranaam docker says "+user;
	}
}
