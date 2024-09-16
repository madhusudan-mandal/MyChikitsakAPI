package com.myChikitsak.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myChikitsak.helper.DoctorIdNotFoundException;
import com.myChikitsak.model.Doctor;
import com.myChikitsak.repository.DoctorRepository;
import com.myChikitsak.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	private DoctorRepository doctorRepository;
	
	@Override
	public Doctor addDoctor(Doctor doctor) {
		return this.doctorRepository.save(doctor);
	}

	@Override
	public Doctor getDoctorById(int id) throws DoctorIdNotFoundException {
		return this.doctorRepository.findById(id).get();
	}

	@Override
	public List<Doctor> getAllDoctor() {
		return this.doctorRepository.findAll();
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {		
		return this.doctorRepository.save(doctor);
	}

	@Override
	public void deleteDoctor(int id) {
		this.doctorRepository.deleteById(id);
		
	}

}
