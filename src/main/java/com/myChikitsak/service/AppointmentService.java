package com.myChikitsak.service;

import java.util.List;

import com.myChikitsak.helper.AppointmentIdNotFoundException;
import com.myChikitsak.helper.DoctorIdNotFoundException;
import com.myChikitsak.helper.PatientIdNotFoundException;
import com.myChikitsak.model.Appointment;

public interface AppointmentService {
	
	public Appointment addAppointment(Appointment appointment);

	public Appointment getAppointmentById(int id) throws AppointmentIdNotFoundException;

	public List<Appointment> getAllAppointment();
	
	public List<Appointment> getAppointmentByDoctorId(int id) throws DoctorIdNotFoundException;
	
	public List<Appointment> getAppointmentByPatientId (int id) throws PatientIdNotFoundException;
	
}
