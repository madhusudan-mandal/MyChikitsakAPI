package com.myChikitsak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myChikitsak.helper.AppointmentIdNotFoundException;
import com.myChikitsak.helper.DoctorIdNotFoundException;
import com.myChikitsak.helper.PatientIdNotFoundException;
import com.myChikitsak.model.AppointTest;
import com.myChikitsak.service.AppointTestService;

@RestController
@RequestMapping("/appointTest")
@CrossOrigin("*")
public class AppointTestController {
	
	@Autowired
	private AppointTestService appointTestService;
	
	@PostMapping("/")
	public AppointTest addAppointment(@RequestBody AppointTest appointTest) {
		return this.appointTestService.addAppointment(appointTest);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getAppointmentById(@PathVariable("id") int id) {
		try {
			AppointTest appointTest = appointTestService.getAppointmentById(id);
			return new ResponseEntity<AppointTest>(appointTest, HttpStatus.OK);
		} catch (AppointmentIdNotFoundException e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	
	@GetMapping("/doctor/{id}")
	public ResponseEntity<List<AppointTest>> getAppointmentByDoctorId(@PathVariable("id") int id) {
		try {
			List<AppointTest> appointTest = appointTestService.getAppointmentByDoctorId(id);
			return new ResponseEntity<List<AppointTest>>(appointTest, HttpStatus.OK);
		} catch (DoctorIdNotFoundException e) {
			 e.getMessage();
			return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
	@GetMapping("/patient/{id}")
	public ResponseEntity<List<AppointTest>> getAppointmentByPatientId(@PathVariable("id") int id) {
		try {
			List<AppointTest> appointTest = appointTestService.getAppointmentByPatientId(id);
			return new ResponseEntity<List<AppointTest>>(appointTest, HttpStatus.OK);
		} catch (PatientIdNotFoundException e) {
			 e.getMessage();
			return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
	@PutMapping("/")
    public AppointTest updateAppointTest(@RequestBody AppointTest appointTest) {
        return this.appointTestService.updateAppointment(appointTest);
    }

    
    @DeleteMapping("/{AppointTestId}")
    public void deleteAppointTest(@PathVariable("AppointTestId") int appointTestId) {
        this.appointTestService.deleteAppointment(appointTestId);
    }
}
