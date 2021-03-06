package com.learning.kubernetes.springbootmysqlclient;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/springboot-mysql-client")
public class SpringBootMySQLClientController {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootMySQLClientController.class);

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${SERVICE_HOST:localhost}")
	private String serviceHost;
	
	@Value("${SERVICE_PORT:9090}")
	private String serviceport;
	
	@Value("${HELLO_WORLD_PORT:8089}")
	private String helloWorldPort;
	
	@Value("${HELLO_WORLD_HOST:localhost}")
	private String helloWorldHost;
	
	@GetMapping("/find")
	public List<GodClient> findAll(){
		LOGGER.info("jai shree ram while finding all gods using logger");
		System.out.println("jai shree ram while finding all gods using println");
		String url = "http://" + serviceHost+ ":" +serviceport + "/springboot-mysql/bhagwan";
		GodClient[] result =restTemplate.getForEntity(url, GodClient[].class).getBody();
		return Arrays.stream(result)
			  .collect(Collectors.toList());
		
	}
	
	@GetMapping("/find/{id}")
	public GodClient findByID(@PathVariable Integer id){
		LOGGER.info("jai shree ram while finding specific god using logger");
		System.out.println("jai shree ram while finding specific god using println");
		String url = "http://" + serviceHost+ ":" +serviceport + "/springboot-mysql/bhagwan/" + id;
		return restTemplate.getForEntity(url, GodClient.class).getBody();
	}
	
	@GetMapping("/loadBalancingTest")
	public String loadBalancingTest() {
		LOGGER.info("jai shree ram from loadBalancingTest using logger");
		System.out.println("jai shree ram from loadBalancingTest using println");
		String url = "http://" + helloWorldHost+ ":" +helloWorldPort + "/hello-kubernetes/test";
		return restTemplate.getForEntity(url, String.class).getBody();
	}
}