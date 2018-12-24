package com.ztwl.mdata.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ztwl.mdata.entiy.User;
import com.ztwl.mdata.mapper.UserMapper;


@Component
public class UserManager {
	@Autowired
	UserMapper userMapper;
	
	public List<User> getUserList() {
		return userMapper.getUserList();
	}
	
	public int getUser(String userName,String password) {
		return userMapper.getUser(userName, password);
	}
}