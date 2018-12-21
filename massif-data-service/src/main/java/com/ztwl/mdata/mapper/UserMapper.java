package com.ztwl.mdata.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ztwl.mdata.entiy.User;

@Mapper
public interface UserMapper {
	
	List<User> getUserList();
	
	int getUser(@Param("userName")String userName,@Param("password")String password);
}
