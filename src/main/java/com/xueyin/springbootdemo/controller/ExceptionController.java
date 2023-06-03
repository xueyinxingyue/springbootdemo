package com.xueyin.springbootdemo.controller;

import com.xueyin.springbootdemo.exception.AgeException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {
    @RequestMapping("runtime")
    public String runtime(){
        if(1 == 1){
            throw new RuntimeException("系统异常，请稍后再试");
        }
        return "runtime";
    }

    @RequestMapping("ex")
    public String ex() throws Exception{
        if(1 == 1){
            throw new Exception("请稍后再试");
        }
        return "runtime";
    }

    @RequestMapping("age")
    public String age(){
        if(1 == 1){
            throw new AgeException("年龄不合法");
        }
        return "runtime";
    }
}
