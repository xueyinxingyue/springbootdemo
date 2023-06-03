package com.xueyin.springbootdemo.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/*
* @Value()：为对象注入普通类型属性值
* @Autowired：为对象注入某个类型的对象
*
* 硬编码
* 怎么解决硬编译：用配置文件
*/
@Data
@Component
@ConfigurationProperties(prefix = "dept")
public class MyDataSource1 {
    private int id;
    private String name;
    private String sn;
}
