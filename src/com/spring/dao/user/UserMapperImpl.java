package com.spring.dao.user;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import sun.security.action.GetLongAction;

import com.spring.pojo.User;

public class UserMapperImpl implements UserMapper {
	private SqlSessionTemplate sqlsession;

	public List<User> getUserList(User user) {
		return sqlsession.selectList(
				"getUserList", user);
	}
	
	public SqlSessionTemplate getSqlsession() {
		return sqlsession;
	}

	public void setSqlsession(SqlSessionTemplate sqlsession) {
		this.sqlsession = sqlsession;
	}
	
}
