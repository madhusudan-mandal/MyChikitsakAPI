package com.myChikitsak.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myChikitsak.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{
 public List<Appointment> findByDoctor(int id);
 public List<Appointment> findByPatient(int id);
}
