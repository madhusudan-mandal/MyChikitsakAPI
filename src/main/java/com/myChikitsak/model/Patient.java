package com.myChikitsak.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Patient {
	@Id
	private int id;

	private String name;
	private int age;
	private String gender;
	private String phone;
	private String email;
	
//	@JsonIgnore
//	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "patient")
//	private List<Appointment> appointment;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Patient(String name, int age, String gender, String phone, String email) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
