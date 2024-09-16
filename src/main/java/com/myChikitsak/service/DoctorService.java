package com.myChikitsak.service;

import java.util.List;

import com.myChikitsak.helper.DoctorIdNotFoundException;
import com.myChikitsak.model.Doctor;

public interface DoctorService {

	public Doctor addDoctor(Doctor doctor);

	public Doctor getDoctorById(int id) throws DoctorIdNotFoundException;

	public List<Doctor> getAllDoctor();
	
	public Doctor updateDoctor(Doctor doctor);
	
	public void deleteDoctor(int id);
}
