package com.myChikitsak.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myChikitsak.model.User;
import com.myChikitsak.repository.UserRepository;
import com.myChikitsak.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User addUser(User user) {
		return this.userRepository.save(user);
	}

	@Override
	public User getUserById(String id) {		
		return this.userRepository.findById(id).get();
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
