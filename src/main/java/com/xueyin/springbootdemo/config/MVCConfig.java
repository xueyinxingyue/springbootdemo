package com.xueyin.springbootdemo.config;

import com.xueyin.springbootdemo.intercepter.LoginIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MVCConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginIntercepter())
                .addPathPatterns("/**")      //指定对哪些请求拦截
                .excludePathPatterns("/hello")     //不拦截的请求
        ;
    }
}
