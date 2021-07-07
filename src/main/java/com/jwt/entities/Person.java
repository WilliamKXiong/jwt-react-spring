package com.jwt.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "person")
@NamedQuery(name = "Person.findAll", query = "SELECT p FROM Person p")
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	public Person() {
		super();
		this.firstName="";
		this.lastName="";
		this.email="";
		this.password="";
	}
	public Person(String firstName, String lastName, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	@Id
	@GeneratedValue
	@Column(name = "person_id")
	private int personId;

	@Column(name = "person_first_name")
	private String firstName;

	@Column(name = "person_last_name")
	private String lastName;
	
	@Column(name = "person_email")
	private String email;

	@Column(name = "person_password")
	private String password;

	public int getPersonId() {
		return personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
