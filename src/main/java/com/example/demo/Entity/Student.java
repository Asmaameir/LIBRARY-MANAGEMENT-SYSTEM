package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long S_id;
	
	@Column(name="Firstname",nullable=false)
	private String Firstname;
	
	@Column(name="Lastname",nullable=false)
	private String Lastname;
	
	@Column(name="Username",nullable=false)
	private String Username;
	
	@Column(name="Email",nullable=false)
	private String Email;
	
	@Column(name="Phoneno",nullable=false)
	private int Phoneno;
	
	@Column(name="Coursename",nullable=false)
	private String Coursename;
	
	@Column(name="Year",nullable=false)
	private int Year;
	
	@Column(name="Password",nullable=false)
	private String Password;
	
	public Student() {
		
	}

	public Student(Long s_id, String firstname, String lastname, String username, String email, int phoneno,
			String coursename, int year, String password) {
		super();
		S_id = s_id;
		Firstname = firstname;
		Lastname = lastname;
		Username = username;
		Email = email;
		Phoneno = phoneno;
		Coursename = coursename;
		Year = year;
		Password = password;
	}

	public Long getS_id() {
		return S_id;
	}

	public void setS_id(Long s_id) {
		S_id = s_id;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getPhoneno() {
		return Phoneno;
	}

	public void setPhoneno(int phoneno) {
		Phoneno = phoneno;
	}

	public String getCoursename() {
		return Coursename;
	}

	public void setCoursename(String coursename) {
		Coursename = coursename;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	

}
