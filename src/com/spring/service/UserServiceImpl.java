package com.spring.service;

import java.util.List;

import com.spring.dao.user.UserMapper;
import com.spring.pojo.User;

public class UserServiceImpl implements UserService {
	private UserMapper userMapper;

	public List<User> getAllUserList(User user) {
		try{
			return userMapper.getUserList(user);
		}catch(RuntimeException e){
			e.printStackTrace();
			throw e;
		}
	}

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

}
