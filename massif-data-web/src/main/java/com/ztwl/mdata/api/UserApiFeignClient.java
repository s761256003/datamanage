package com.ztwl.mdata.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value="massif-data-service",fallback=MessageApiFailBack.class)
public interface UserApiFeignClient {

	@RequestMapping("/getUserList")
	String getUserList();
	
	@RequestMapping("/userLogin")
	String getUser(@RequestParam("userName")String userName,@RequestParam("password")String password);
}
