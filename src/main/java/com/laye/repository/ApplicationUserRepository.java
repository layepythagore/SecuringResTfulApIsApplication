package com.laye.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laye.entity.ApplicationUser;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long>{
	
	ApplicationUser findByUsername(String username);
}
