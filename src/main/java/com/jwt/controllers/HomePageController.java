package com.jwt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.entities.Employee;
import com.jwt.repositories.EmployeeRepository;

@RestController
public class HomePageController {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//677509
	@RequestMapping("/")
	public String index() {
		String employeeNames = "";
		System.out.println(employeeRepository.findAll().size());
		return "Hello world" +" and hello employees [" + employeeNames + "]";
	}
}