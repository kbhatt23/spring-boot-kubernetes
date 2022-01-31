package com.learning.userservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.learning.userservice.entities.UserEntity;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepostiory extends JpaRepository<UserEntity, Long> {
	
	List<UserEntity> findByFirstName(@Param("name") String name);
	
	List<UserEntity> findByLastName(@Param("name") String name);
}
