package com.myChikitsak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myChikitsak.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{

}
