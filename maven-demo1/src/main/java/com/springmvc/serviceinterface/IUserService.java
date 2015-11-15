package com.springmvc.serviceinterface;

import org.springframework.stereotype.Service;

import com.springmvc.pojo.User;


public interface IUserService {
	
	public User getUserById(int userId);
}
