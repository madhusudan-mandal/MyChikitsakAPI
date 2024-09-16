package com.myChikitsak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myChikitsak.model.User;

public interface UserRepository extends JpaRepository<User, String> {

}
