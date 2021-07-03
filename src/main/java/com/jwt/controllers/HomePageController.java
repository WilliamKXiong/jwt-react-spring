package com.jwt.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.repositories.UserRepository;
import com.jwt.entities.User;

@RestController
public class HomePageController {
	/*
	@Autowired
	UserRepository userRepository;

	@RequestMapping("/")
	public List<User> index() {
		
		return userRepository.findAll();
	}
	
	public void populateUsers() {
		List<User> users = new ArrayList<User>();
		users.add(new User("admin", "admin"));
		users.add(new User("Billy", "Bob"));
		userRepository.saveAll(users);
	}*/
}