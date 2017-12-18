package com.laye.rest;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import scala.annotation.meta.setter;

import com.laye.entity.ApplicationUser;
import com.laye.repository.ApplicationUserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

	private ApplicationUserRepository applicationUserRepository;
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public UserController(ApplicationUserRepository applicationUserRepository, 
			BCryptPasswordEncoder bCryptPasswordEncoder){
		
		this.applicationUserRepository = applicationUserRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}
	
	@PostMapping("/sign-up")
	public void signUp(@RequestBody ApplicationUser user){
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		applicationUserRepository.save(user);
	}
}
