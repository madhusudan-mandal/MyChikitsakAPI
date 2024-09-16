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

import com.myChikitsak.helper.DoctorIdNotFoundException;
import com.myChikitsak.model.Doctor;
import com.myChikitsak.service.DoctorService;

@RestController
@RequestMapping("/doctor")
@CrossOrigin("*")
public class DoctorController {
	@Autowired
	private DoctorService doctorService;

	@PostMapping("/")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		return this.doctorService.addDoctor(doctor);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getDoctor(@PathVariable("id") int id) {
		try {
			Doctor doctor = doctorService.getDoctorById(id);
			return new ResponseEntity<Doctor>(doctor, HttpStatus.OK);
		} catch (DoctorIdNotFoundException e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/")
	public List<Doctor> getAllDoctor() {
		return this.doctorService.getAllDoctor();
	}
	
	@PutMapping("/")
    public Doctor updateDoctor(@RequestBody Doctor doctor) {
        return this.doctorService.updateDoctor(doctor);
    }

    
    @DeleteMapping("/{DoctorId}")
    public void deleteDoctor(@PathVariable("DoctorId") int doctorId) {
        this.doctorService.deleteDoctor(doctorId);
    }

}
