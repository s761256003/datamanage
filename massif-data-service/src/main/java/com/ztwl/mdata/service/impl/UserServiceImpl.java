package com.ztwl.mdata.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ztwl.mdata.entiy.User;
import com.ztwl.mdata.manager.UserManager;
import com.ztwl.mdata.service.UserService;

@RestController
public class UserServiceImpl implements UserService {
	
	public static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserManager userManager;

	@Override
	public List<User> getUserList() {
		logger.info("进入服务端页面");
		return userManager.getUserList();
	}

	@Override
	public String getUser(String userName, String password) {
		logger.info("进入服务端登录");
		int i =userManager.getUser(userName, password);
		if(i==0) {
			return "false";
		}
		return "true";
	}
	
	
	
}
