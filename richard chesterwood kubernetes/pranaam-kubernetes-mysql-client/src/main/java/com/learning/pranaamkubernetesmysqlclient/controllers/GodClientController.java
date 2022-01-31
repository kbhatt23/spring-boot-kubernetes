package com.learning.pranaamkubernetesmysqlclient.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.learning.pranaamkubernetesmysqlclient.beans.GodClient;

@RestController
@RequestMapping("/god-client")
public class GodClientController {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${SERVICE_HOST:localhost}")
	private String serviceHost;

	@Value("${SERVICE_PORT:9090}")
	private String serviceport;

	private static final Logger LOGGER = LoggerFactory.getLogger(GodClientController.class);

	@GetMapping()
	public List<GodClient> findAll() {
		LOGGER.info("findAll: Client finding all bhagwan items");
		String url = "http://" + serviceHost + ":" + serviceport + "/bhagwan";
		GodClient[] result = restTemplate.getForEntity(url, GodClient[].class).getBody();
		return Arrays.stream(result).collect(Collectors.toList());

	}

	@GetMapping("/{id}")
	public GodClient findByID(@PathVariable int id) {
		LOGGER.info("findById: client finding specific bhagwan with id: " + id);
		String url = "http://" + serviceHost + ":" + serviceport + "/bhagwan/" + id;
		return restTemplate.getForEntity(url, GodClient.class).getBody();
	}
}