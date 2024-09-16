package com.myChikitsak.service;

import java.util.List;

import com.myChikitsak.helper.AppointmentIdNotFoundException;
import com.myChikitsak.helper.DoctorIdNotFoundException;
import com.myChikitsak.helper.PatientIdNotFoundException;
import com.myChikitsak.model.AppointTest;
public interface AppointTestService {
	
	public AppointTest addAppointment(AppointTest appointTest);
	
	public AppointTest getAppointmentById(int id) throws AppointmentIdNotFoundException;

	public List<AppointTest> getAllAppointment();
	
	public List<AppointTest> getAppointmentByDoctorId(int id) throws DoctorIdNotFoundException;
	
	public List<AppointTest> getAppointmentByPatientId (int id) throws PatientIdNotFoundException;
	
	public AppointTest updateAppointment(AppointTest appointTest);
	
	public void deleteAppointment(int id);
}
