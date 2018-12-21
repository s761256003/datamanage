package com.ztwl.mdata.controller;




import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.ztwl.mdata.api.UserApiFeignClient;


@Controller
@RequestMapping("/user")
public class UserController {
	public static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserApiFeignClient userApi;
	
	@RequestMapping(value="/getUserList")
	public String listUser(Model model) {
		String users = userApi.getUserList();
		JSONArray arry = (JSONArray)JSONArray.parseArray(users);
		model.addAttribute("users", arry);
		System.out.println(arry);
		return "user/userList";
	}
	
	@RequestMapping(value="/userLogin",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,String> userLogin(String userName,String password) {
		Map<String, String> result = new HashMap<String, String>();
		String flag = userApi.getUser(userName, password);
		if(flag.equals("true")) {
			result.put("state","1" );
			result.put("msg","成功" );
		}else {
			result.put("state","0" );
			result.put("msg", "失败");
		}
		return result;
	}
	
}
