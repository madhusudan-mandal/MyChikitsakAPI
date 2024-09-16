package com.myChikitsak.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myChikitsak.helper.AppointmentIdNotFoundException;
import com.myChikitsak.helper.DoctorIdNotFoundException;
import com.myChikitsak.helper.PatientIdNotFoundException;
import com.myChikitsak.model.Appointment;
import com.myChikitsak.repository.AppointmentRepository;
import com.myChikitsak.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService{

	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Override
	public Appointment addAppointment(Appointment appointment) {
		return this.appointmentRepository.save(appointment);
	}

	@Override
	public Appointment getAppointmentById(int id) throws AppointmentIdNotFoundException {
		return this.appointmentRepository.findById(id).get();
	}

	@Override
	public List<Appointment> getAllAppointment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointment> getAppointmentByDoctorId(int id) throws DoctorIdNotFoundException {		
		return this.appointmentRepository.findByDoctor(id);
	}

	@Override
	public List<Appointment> getAppointmentByPatientId(int id) throws PatientIdNotFoundException {
		return this.appointmentRepository.findByPatient(id);
	}

}
