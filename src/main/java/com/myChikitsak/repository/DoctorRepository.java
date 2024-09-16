package com.myChikitsak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myChikitsak.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
