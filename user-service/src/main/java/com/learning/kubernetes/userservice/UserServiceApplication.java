package com.learning.kubernetes.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.learning.kubernetes.userservice.bean.User;
import com.learning.kubernetes.userservice.bean.UserRepostiory;

@SpringBootApplication
public class UserServiceApplication {
	@Autowired
	private UserRepostiory userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				
				User u1 = new User("kanishk", 27, true);
				User u2 = new User("messi", 32, true);
				User u3 = new User("josh", 38, false);
				userRepository.save(u1);
				userRepository.save(u2);
				userRepository.save(u3);
				
			}
		};
	}
}
