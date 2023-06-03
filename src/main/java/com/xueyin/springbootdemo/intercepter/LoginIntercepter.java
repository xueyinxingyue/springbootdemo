package com.xueyin.springbootdemo.intercepter;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 登录拦截器
 *  可以对用户发送的请求拦截
 *      对用户的请求验证，当验证通过后，放行
 */
public class LoginIntercepter implements HandlerInterceptor {
    //当用户发送请求，服务器处理请求前，自动调用该方法
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //对用户的请求进行校验
        System.out.println("拦截到用户的请求");

        //如果返回 true 放行
        //返回false 拦截请求

        return false;
    }
}
