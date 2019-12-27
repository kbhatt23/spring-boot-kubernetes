package com.learning.kubernetes.usermanagementservice;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.learning.kubernetes.usermanagementservice.environment.InstanceInformationService;

@RestController
public class UserManagementController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Environment env;
	
	@Autowired
	private InstanceInformationService instanceService;
	
	@GetMapping("/user-names")
	public List namesList(){
		String host = env.getProperty("user-service.host");
		String port = env.getProperty("user-service.port");
		   final String baseUrl = "http://"+ host + ":" +port+ "/users";
		    URI uri;
			try {
				uri = new URI(baseUrl);
				 ResponseEntity<List> result = restTemplate.getForEntity(uri, List.class);
				    return result.getBody();
			} catch (Exception e) {
				return Arrays.asList("error" , " Exception: "+e);
			}
		 
		   
	}
	
	@GetMapping("/test")
	public String test() {
		System.out.println("logs ke sath testing karo");
		return "jai shree ram v4 "+ instanceService.retrieveInstanceInfo();
	}
}
