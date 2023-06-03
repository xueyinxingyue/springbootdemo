package com.xueyin.springbootdemo.config;

import com.xueyin.springbootdemo.entity.Department;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * */
@Configuration      //标识当前类是一个配置类
public class AppConfig {
    //配置一个bean对象    方法就会bean对象
    @Bean
    public Department getDepartment(){
        Department department = new Department();
        department.setId(1);
        department.setName("开发部");
        department.setSn("dev");
        return department;
    }

    //将交与容器
    @Bean
    public Department getDepartment2(){
        Department department = new Department();
        department.setId(2);
        department.setName("开发部");
        department.setSn("dev");
        return department;
    }
}
