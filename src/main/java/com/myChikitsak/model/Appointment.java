package com.myChikitsak.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.ColumnDefault;

@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable=true)
	private Date dateOfVisit;
	
	private String problem;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@Cascade(CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "patient_id")
	private Patient patient;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@Cascade(CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "doctor_id")
	private Doctor doctor;
	
	@ColumnDefault("false")
	private boolean status = false;
	
	@Column(nullable=true,length = 5000)
	private String prescription;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(int id, Date dateOfVisit, String problem, Patient patient, Doctor doctor, boolean status,
			String prescription) {
		super();
		this.id = id;
		this.dateOfVisit = dateOfVisit;
		this.problem = problem;
		this.patient = patient;
		this.doctor = doctor;
		this.status = status;
		this.prescription = prescription;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateOfVisit() {
		return dateOfVisit;
	}

	public void setDateOfVisit(Date dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

}
