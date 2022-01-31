package com.learning.pranaamkubernetesmysql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.pranaamkubernetesmysql.beans.God;
@Repository
public interface GodRepository extends JpaRepository<God, Integer>{

}