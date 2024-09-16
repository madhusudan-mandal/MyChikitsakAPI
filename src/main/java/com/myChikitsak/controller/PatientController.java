package com.myChikitsak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myChikitsak.helper.PatientIdNotFoundException;
import com.myChikitsak.model.Patient;
import com.myChikitsak.service.PatientService;

@RestController
@RequestMapping("/patient")
@CrossOrigin("*")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@PostMapping("/")
	public Patient addPatient(@RequestBody Patient patient) {
		return this.patientService.addPatient(patient);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getPatient(@PathVariable("id") int id) {
		try {
			Patient patient = patientService.getPatientById(id);
			return new ResponseEntity<Patient>(patient, HttpStatus.OK);
		} catch (PatientIdNotFoundException e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
}
