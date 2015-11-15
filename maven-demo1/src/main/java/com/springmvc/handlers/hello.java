package com.springmvc.handlers;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.pojo.User;
import com.springmvc.service.impl.UserServiceImpl;

/**
 * Created by Administrator on 2015/11/12.
 */
@Controller
public class hello {
	@Resource
	@Qualifier(value="UserServiceImpl")
	private UserServiceImpl userService;
	
    @RequestMapping(value = "/hello")
    public String helloWorld() {
    	
        System.out.println("HelloWorld");
        
        User user = this.userService.getUserById(1);
        
        System.out.println(user.getName());

        return "success";

    }



}
