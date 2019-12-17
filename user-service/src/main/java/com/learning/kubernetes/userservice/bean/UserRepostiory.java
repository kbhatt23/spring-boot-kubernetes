package com.learning.kubernetes.userservice.bean;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepostiory extends JpaRepository<User, Integer>{

	public Optional<User> findByName(String name);
	
}
