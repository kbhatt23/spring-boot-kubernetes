package com.learning.kubernetes.springbootmysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot-mysql/bhagwan")
public class GodController {
	@Autowired
	private GodRepository repo;
	@GetMapping
	public List<God> findAllGods(){
		System.out.println("Finding all bhagwan items");
		return repo.findAll();
	}
	
	@PostMapping
	public God createGod(@RequestBody God god) {
		if(god.getId() != null) {
			throw new RuntimeException("Can not pass ID");
		}
		System.out.println("Creating bhagwan item");
		return repo.save(god);
	}
	
	@GetMapping("/{id}")
	public God findById(@PathVariable Integer id) {
		System.out.println("Finding specific bhagwan");
		return repo.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
	}
}
