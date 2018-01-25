package com.spring.dao.user;

import java.util.List;

import com.spring.pojo.User;

public interface UserMapper {
	public List<User> getUserList(User user);
	
	public Integer addUser(User user);
}
