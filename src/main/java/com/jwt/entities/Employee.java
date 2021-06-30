package com.jwt.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the Employee database table.
 * 
 */
@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal ageInCompanyYears;

	private BigDecimal ageInYears;

	private String city;

	private String county;

	private String dateOfBirth;

	private String dateOfJoining;

	private int dayOfJoining;

	private String DOWOfJoining;

	private String email;

	@Id
	private int employeeID;

	private String fathersName;

	private String firstName;

	private String gender;

	private String halfOfJoining;

	private String lastName;

	private String lastPercentageHike;

	private String middleInitial;

	private String monthNameOfJoining;

	private int monthOfJoining;

	private String motherMaidenName;

	private String mothersName;

	private String namePrefix;

	private String password;

	private String phoneNumber;

	private String placeName;

	private String quarterOfJoining;

	private String region;

	private int salary;

	private String shortDOW;

	private String shortMonth;

	private String ssn;

	private String state;

	private String timeOfBirth;

	@Column(name="`User Name`")
	private String userName;

	private int weightInKilograms;

	private int yearOfJoining;

	private int zip;

	public Employee() {
	}

	public BigDecimal getAgeInCompanyYears() {
		return this.ageInCompanyYears;
	}

	public void setAgeInCompanyYears(BigDecimal ageInCompanyYears) {
		this.ageInCompanyYears = ageInCompanyYears;
	}

	public BigDecimal getAgeInYears() {
		return this.ageInYears;
	}

	public void setAgeInYears(BigDecimal ageInYears) {
		this.ageInYears = ageInYears;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return this.county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDateOfJoining() {
		return this.dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public int getDayOfJoining() {
		return this.dayOfJoining;
	}

	public void setDayOfJoining(int dayOfJoining) {
		this.dayOfJoining = dayOfJoining;
	}

	public String getDOWOfJoining() {
		return this.DOWOfJoining;
	}

	public void setDOWOfJoining(String DOWOfJoining) {
		this.DOWOfJoining = DOWOfJoining;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEmployeeID() {
		return this.employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getFathersName() {
		return this.fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHalfOfJoining() {
		return this.halfOfJoining;
	}

	public void setHalfOfJoining(String halfOfJoining) {
		this.halfOfJoining = halfOfJoining;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastPercentageHike() {
		return this.lastPercentageHike;
	}

	public void setLastPercentageHike(String lastPercentageHike) {
		this.lastPercentageHike = lastPercentageHike;
	}

	public String getMiddleInitial() {
		return this.middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getMonthNameOfJoining() {
		return this.monthNameOfJoining;
	}

	public void setMonthNameOfJoining(String monthNameOfJoining) {
		this.monthNameOfJoining = monthNameOfJoining;
	}

	public int getMonthOfJoining() {
		return this.monthOfJoining;
	}

	public void setMonthOfJoining(int monthOfJoining) {
		this.monthOfJoining = monthOfJoining;
	}

	public String getMotherMaidenName() {
		return this.motherMaidenName;
	}

	public void setMotherMaidenName(String motherMaidenName) {
		this.motherMaidenName = motherMaidenName;
	}

	public String getMothersName() {
		return this.mothersName;
	}

	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}

	public String getNamePrefix() {
		return this.namePrefix;
	}

	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPlaceName() {
		return this.placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getQuarterOfJoining() {
		return this.quarterOfJoining;
	}

	public void setQuarterOfJoining(String quarterOfJoining) {
		this.quarterOfJoining = quarterOfJoining;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getShortDOW() {
		return this.shortDOW;
	}

	public void setShortDOW(String shortDOW) {
		this.shortDOW = shortDOW;
	}

	public String getShortMonth() {
		return this.shortMonth;
	}

	public void setShortMonth(String shortMonth) {
		this.shortMonth = shortMonth;
	}

	public String getSsn() {
		return this.ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTimeOfBirth() {
		return this.timeOfBirth;
	}

	public void setTimeOfBirth(String timeOfBirth) {
		this.timeOfBirth = timeOfBirth;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getWeightInKilograms() {
		return this.weightInKilograms;
	}

	public void setWeightInKilograms(int weightInKilograms) {
		this.weightInKilograms = weightInKilograms;
	}

	public int getYearOfJoining() {
		return this.yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public int getZip() {
		return this.zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

}