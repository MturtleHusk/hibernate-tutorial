package com.luv2code.hibernate.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student") // name of the table in mySQL
public class Student {
	
	@Id // used for primary key
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lasrName;
	
	@Column(name="email")
	private String email;
	
	
	public Student() {
		
	}


	public Student(String firstName, String lasrName, String email) {		
		this.firstName = firstName;
		this.lasrName = lasrName;
		this.email = email;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLasrName() {
		return lasrName;
	}


	public void setLasrName(String lasrName) {
		this.lasrName = lasrName;
	}
	


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lasrName=" + lasrName + ", email=" + email + "]";
	}
}
