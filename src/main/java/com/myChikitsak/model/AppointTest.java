package com.myChikitsak.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AppointTest {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String date;
	private String problem;
	private String status;

	@Column(length = 5000)
	private String prescription;
	private Integer patientId;
	private Integer doctorId;

	public AppointTest() {
		super();
	}

	public AppointTest(String date, String problem, String status, String prescription, Integer patientId,
			Integer doctorId) {
		super();
		this.date = date;
		this.problem = problem;
		this.status = status;
		this.prescription = prescription;
		this.patientId = patientId;
		this.doctorId = doctorId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	
}
