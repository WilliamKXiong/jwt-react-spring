package com.jwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.repositories.UserRepository;
import com.jwt.entities.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/all")
	public List<User> getUsers(){
		System.out.println("getUsers()");
		return userRepository.findAll();
	}
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable int userId) {
		System.out.println("getUser()");
		return userRepository.findByUserId(userId);
	}

}
