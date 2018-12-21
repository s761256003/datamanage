package com.ztwl.mdata.api;

import org.springframework.stereotype.Component;

@Component
public class MessageApiFailBack implements UserApiFeignClient{

	@Override
	public String getUserList() {
		return "出错啦";
	}

	@Override
	public String getUser(String userName, String password) {
		// TODO Auto-generated method stub
		return "出错啦";
	}
    
	
}