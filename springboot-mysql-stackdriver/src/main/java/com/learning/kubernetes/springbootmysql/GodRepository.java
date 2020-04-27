package com.learning.kubernetes.springbootmysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface GodRepository extends JpaRepository<God, Integer>{

}
