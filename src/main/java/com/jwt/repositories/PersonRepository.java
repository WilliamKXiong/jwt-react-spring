package com.jwt.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{
	List<Person> findByFirstName(String firstName);
	List<Person> findByLastName(String lastName);
	Person findByEmail(String email);
	Person findByPersonId(int personId);
}
