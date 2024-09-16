package com.myChikitsak.controller;

import java.util.List;

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

import com.myChikitsak.helper.AppointmentIdNotFoundException;
import com.myChikitsak.helper.DoctorIdNotFoundException;
import com.myChikitsak.helper.PatientIdNotFoundException;
import com.myChikitsak.model.Appointment;
import com.myChikitsak.service.AppointmentService;

@RestController
@RequestMapping("/appointCont")
@CrossOrigin("*")
public class AppointmentController {
	@Autowired
	private AppointmentService appointmentService;
	
	@PostMapping("/")
	public Appointment addAppointment(@RequestBody Appointment appointment) {
		return this.appointmentService.addAppointment(appointment);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getAppointment(@PathVariable("id") int id) {
		try {
			Appointment appointment = appointmentService.getAppointmentById(id);
			return new ResponseEntity<Appointment>(appointment, HttpStatus.OK);
		} catch (AppointmentIdNotFoundException e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/doctor/{id}")
	public ResponseEntity<List<Appointment>> getAppointmentByDoctorId(@PathVariable("id") int id) {
		try {
			List<Appointment> appointment = appointmentService.getAppointmentByDoctorId(id);
			return new ResponseEntity<List<Appointment>>(appointment, HttpStatus.OK);
		} catch (DoctorIdNotFoundException e) {
			 e.getMessage();
			return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	@GetMapping("/patient/{id}")
	public ResponseEntity<List<Appointment>> getAppointmentByPatientId(@PathVariable("id") int id) {
		try {
			List<Appointment> appointment = appointmentService.getAppointmentByPatientId(id);
			return new ResponseEntity<List<Appointment>>(appointment, HttpStatus.OK);
		} catch (PatientIdNotFoundException e) {
			e.getMessage();
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}

}
