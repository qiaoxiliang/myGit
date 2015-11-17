package com.spring.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.UserDao;
import com.spring.pojo.User;
import com.spring.service.IUserService;

@Service("userServiceImpl")
public class UserServiceImpl implements IUserService{
	
	@Resource
	private UserDao userDao;

	public User getUserById(int userId) {
		
		System.out.println("service");
		
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
		
//		User user = new User();
//		
//		user.setName("test1");
//		
//		return user;
	}
	
	
	
	
	
}
