package com.myChikitsak.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myChikitsak.helper.PatientIdNotFoundException;
import com.myChikitsak.model.Patient;
import com.myChikitsak.repository.PatientRepository;
import com.myChikitsak.repository.UserRepository;
import com.myChikitsak.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Patient addPatient(Patient patient) {
		return this.patientRepository.save(patient);
	}

	@Override
	public Patient getPatientById(int id) throws PatientIdNotFoundException {		
		return this.patientRepository.findById(id).get();
	}

	@Override
	public List<Patient> getAllPatient() {
		
		return null;
	}
	
}
