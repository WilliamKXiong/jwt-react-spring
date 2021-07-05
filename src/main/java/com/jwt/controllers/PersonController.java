package com.jwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.repositories.PersonRepository;
import com.jwt.entities.Person;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	PersonRepository personRepository;
	
	@GetMapping("/all")
	public List<Person> getPersons(){
		System.out.println("getPersons()");
		return personRepository.findAll();
	}
	
	@GetMapping("/{personId}")
	public Person getPerson(@PathVariable int personId) {
		System.out.println("getPerson()");
		return personRepository.findByPersonId(personId);
	}
	
	/*
	@GetMapping("/{email}")
	public Person getEmail(@PathVariable String email) {
		System.out.println("getEmail()");
		return personRepository.findByEmail(email);
	}*/
	
	

}
