package com.spring.handler;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.UserModel;
import com.spring.pojo.User;
import com.spring.service.impl.UserServiceImpl;

@Controller
public class LoginHandler {
	
	@Resource
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping("/login")
	public String login() {
		
		User user = userServiceImpl.getUserById(1);
		
		UserModel userModel = new UserModel();
		
		BeanUtils.copyProperties(user, userModel);
		
		System.out.println(userModel.getName());
		
		return "login";
		
	}

}
