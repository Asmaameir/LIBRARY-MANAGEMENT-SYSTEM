package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Admin")
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long A_id;
	
	
	@Column(name="A_username",nullable=false)
	private String A_username;
	
	
	@Column(name="A_passsword",nullable=false)
	private String A_password;
	
	public Admin() {
	}

	public Admin(Long a_id, String a_username, String a_password) {
		super();
		A_id = a_id;
		A_username = a_username;
		A_password = a_password;
	}

	public Long getA_id() {
		return A_id;
	}

	public void setA_id(Long a_id) {
		A_id = a_id;
	}

	public String getA_username() {
		return A_username;
	}

	public void setA_username(String a_username) {
		A_username = a_username;
	}

	public String getA_password() {
		return A_password;
	}

	public void setA_password(String a_password) {
		A_password = a_password;
	}
	
	
}
	
