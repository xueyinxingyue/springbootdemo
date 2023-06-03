package com.xueyin.springbootdemo.controller;

import com.xueyin.springbootdemo.entity.Department;
import com.xueyin.springbootdemo.entity.MyDataSource1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody     返回的不是页面，而是数据
@RestController
public class HelloController {
    //注入bean
    @Autowired      //根据类型从数据库中查找对象
    @Qualifier("getDepartment2")    //当Spring容器中该类型的对象有多个，需要指定对象的名字获取
    private Department department;

    @Autowired
    private MyDataSource1 myDataSource1;

    @RequestMapping("hello")
    public String hello(){
        return "hello spring boot";
    }

    @RequestMapping("getDept")
    public Department getDept(){
        return department;
    }

    @RequestMapping("getData1")
    public MyDataSource1 getData(){
        return myDataSource1;
    }
}
