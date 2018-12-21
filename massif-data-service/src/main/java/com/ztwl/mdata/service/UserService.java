package com.ztwl.mdata.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ztwl.mdata.entiy.User;

public interface UserService {
	
	
	@RequestMapping("/getUserList")
	List<User> getUserList();
	
	@RequestMapping("/userLogin")
	String getUser(@RequestParam("userName")String userName,@RequestParam("password")String password);
}
