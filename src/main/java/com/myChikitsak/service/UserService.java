package com.myChikitsak.service;

import java.util.List;

import com.myChikitsak.model.User;

public interface UserService {

	public User addUser(User user);

	public User getUserById(String id);

	public List<User> getAllUser();
}
