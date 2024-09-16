package com.myChikitsak.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private String username;
	private String password;
	private int id;
	private String role;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String username, String password, int id, String role) {
		super();
		this.username = username;
		this.password = password;
		this.id = id;
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
