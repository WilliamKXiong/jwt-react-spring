package com.jwt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	Employee findByEmployeeID(int employeeID);
}
