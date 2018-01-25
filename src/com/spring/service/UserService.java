package com.spring.service;

import java.util.List;

import com.spring.pojo.User;

public interface UserService {
	public List<User> getAllUserList(User user);
	
	public Integer addUser(User user);
	
	public void addUserList(List<User> list);
}
