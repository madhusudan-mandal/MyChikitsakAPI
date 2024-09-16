package com.myChikitsak.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myChikitsak.helper.AppointmentIdNotFoundException;
import com.myChikitsak.helper.DoctorIdNotFoundException;
import com.myChikitsak.helper.PatientIdNotFoundException;
import com.myChikitsak.model.AppointTest;
import com.myChikitsak.repository.AppointTestRepository;
import com.myChikitsak.service.AppointTestService;

@Service
public class AppointTestServiceImpl implements AppointTestService{

	@Autowired
	private AppointTestRepository  appointTestRepository;
	
	@Override
	public AppointTest addAppointment(AppointTest appointTest) {
		return this.appointTestRepository.save(appointTest);
	}

	@Override
	public List<AppointTest> getAllAppointment() {
		return null;
	}

	@Override
	public List<AppointTest> getAppointmentByDoctorId(int id) throws DoctorIdNotFoundException {
		return this.appointTestRepository.findByDoctorId(id);
	}

	@Override
	public List<AppointTest> getAppointmentByPatientId(int id) throws PatientIdNotFoundException {
		return this.appointTestRepository.findByPatientId(id);
	}

	@Override
	public AppointTest getAppointmentById(int id) throws AppointmentIdNotFoundException {
		return this.appointTestRepository.findById(id).get();
	}

	@Override
	public AppointTest updateAppointment(AppointTest appointTest) {		
		return this.appointTestRepository.save(appointTest);
	}

	@Override
	public void deleteAppointment(int id) {
		this.appointTestRepository.deleteById(id);
	}

}
