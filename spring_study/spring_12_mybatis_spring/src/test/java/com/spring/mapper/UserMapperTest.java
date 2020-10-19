package com.spring.mapper;

import com.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMapperTest {
    @Test
    public void selectUserAllTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapperImpl", UserMapper.class);
        for (User user : userMapper.selectUserAll()) {
            System.out.println(user);
        }
    }

    @Test
    public void selectUserAllTest2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapperImpl2", UserMapper.class);
        for (User user : userMapper.selectUserAll()) {
            System.out.println(user);
        }
    }
}
