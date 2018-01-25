package com.spring.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.user.UserMapper;
import com.spring.pojo.User;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource(name="userMapper")
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
