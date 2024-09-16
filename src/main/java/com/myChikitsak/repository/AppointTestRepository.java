package com.myChikitsak.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myChikitsak.model.AppointTest;

public interface AppointTestRepository extends JpaRepository<AppointTest, Integer> {
	public List<AppointTest> findByPatientId(int id);

	public List<AppointTest> findByDoctorId(int id);
}