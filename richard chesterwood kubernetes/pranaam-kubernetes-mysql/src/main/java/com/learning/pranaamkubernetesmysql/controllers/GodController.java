package com.learning.pranaamkubernetesmysql.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.pranaamkubernetesmysql.beans.God;
import com.learning.pranaamkubernetesmysql.repositories.GodRepository;

@RestController
@RequestMapping("/bhagwan")
public class GodController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GodController.class);
	@Autowired
	private GodRepository repo;
	@GetMapping
	public List<God> findAllGods(){
		LOGGER.info("findAllGods: Finding all bhagwan items");
		return repo.findAll();
	}
	
	@PostMapping
	public God createGod(@RequestBody God god) {
		if(god.getId() != null) {
			throw new RuntimeException("createGod: Can not pass ID");
		}
		LOGGER.info("createGod: Creating bhagwan item");
		return repo.save(god);
	}
	
	@GetMapping("/{id}")
	public God findById(@PathVariable int id) {
		LOGGER.info("findById: Finding specific bhagwan with id: "+id);
		return repo.findById(id).orElseThrow(() -> new RuntimeException("findById: Item not found"));
	}
}