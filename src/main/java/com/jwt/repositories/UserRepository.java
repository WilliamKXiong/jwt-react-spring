package com.jwt.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	List<User> findByFirstName(String firstName);
	List<User> findByLastName(String lastName);
}
