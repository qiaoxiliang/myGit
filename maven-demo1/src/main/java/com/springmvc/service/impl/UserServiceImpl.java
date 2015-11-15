package com.springmvc.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springmvc.dao.UserDao;
import com.springmvc.pojo.User;
import com.springmvc.serviceinterface.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
	
//	@Resource
//	@Qualifier(value="UserDao")
//	private UserDao userDao;

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
//		return this.userDao.selectByPrimaryKey(userId);
		
		User user = new User();
		
		user.setName("test1");
		
		return user;
	}
	
	
	
	
}
