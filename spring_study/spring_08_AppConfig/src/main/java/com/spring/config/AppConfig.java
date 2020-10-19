package com.spring.config;

import com.spring.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration代表这是一个配置类，等价于beans.xml
@Configuration
@ComponentScan("com.spring.pojo")
public class AppConfig {

    //注册一个Bean,就相当于beans.xml中的一个<bean/>标签，方法的名字就相当于id属性，
    // 返回值为对应类，相当于class属性
    @Bean
    public User user(){
        return new User();
    }
}
