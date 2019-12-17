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

@RestController
public class UserManagementController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Environment env;
	
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
		return "jai shree ram";
	}
}
