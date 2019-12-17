package com.learning.kubernetes.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.kubernetes.userservice.bean.User;
import com.learning.kubernetes.userservice.bean.UserRepostiory;

@RestController
public class UserController {
	@Autowired
	private UserRepostiory userRepository;
	
	@GetMapping("/users")
	public List<User> fetchAllUser(){
		return userRepository.findAll();
		
	}
	
	@GetMapping("/test")
	public String test() {
		return "jai shree ram";
	}
	
}
