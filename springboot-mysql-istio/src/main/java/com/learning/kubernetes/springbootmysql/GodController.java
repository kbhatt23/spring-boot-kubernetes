package com.learning.kubernetes.springbootmysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/springboot-mysql/bhagwan")
public class GodController {
	@Autowired
	private GodRepository repo;
	private static final Logger LOGGER = LoggerFactory.getLogger(GodController.class);
	
	
	@GetMapping
	public List<God> findAllGods(){
		LOGGER.info("Finding all bhagwan items using logger");
		System.out.println("Finding all bhagwan items using println");
		return repo.findAll();
	}
	
	@PostMapping
	public God createGod(@RequestBody God god) {
		if(god.getId() != null) {
			throw new RuntimeException("Can not pass ID");
		}
		LOGGER.info("Creating bhagwan item using logger");
		System.out.println("Creating bhagwan item using println");
		return repo.save(god);
	}
	
	@GetMapping("/{id}")
	public God findById(@PathVariable Integer id) {
		LOGGER.info("Finding specific bhagwan using logger");
		System.out.println("Finding specific bhagwan using println");
		return repo.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
	}
}
