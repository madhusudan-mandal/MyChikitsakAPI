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
public class Doctor {
	@Id
	private int id;

	private String name;
	private int age;
	private String gender;
	private String specialization;

//	@JsonIgnore
//	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "doctor")
//	private List<Appointment> appointment;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(String name, int age, String gender, String specialization) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.specialization = specialization;
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

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

}
