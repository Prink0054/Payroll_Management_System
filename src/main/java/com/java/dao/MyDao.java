package com.java.dao;

import java.util.List;

import com.java.model.User;

public interface MyDao {

	User checkLogin(String email, String password);
	void logout();
	List<User> getall();
	void save(User user);
}
