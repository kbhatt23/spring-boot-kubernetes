package com.learning.kubernetes.hellokubernetes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

	@RequestMapping("/")
	public String monitor() {
		System.out.println("jai shreee ram from docker monitor");
		return "jai shreee ram from docker";
	}
}
