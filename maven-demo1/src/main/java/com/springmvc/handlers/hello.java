package com.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2015/11/12.
 */
@Controller
public class hello {

    @RequestMapping(value = "/hello")
    public String helloWorld() {

        System.out.println("HelloWorld");

        return "success";

    }



}
