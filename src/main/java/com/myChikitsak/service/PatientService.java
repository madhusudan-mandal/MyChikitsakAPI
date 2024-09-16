package com.myChikitsak.service;

import java.util.List;

import com.myChikitsak.helper.PatientIdNotFoundException;
import com.myChikitsak.model.Patient;

public interface PatientService {

	public Patient addPatient(Patient patient);

	public Patient getPatientById(int id) throws PatientIdNotFoundException;

	public List<Patient> getAllPatient();

}
