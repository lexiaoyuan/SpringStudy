package com.spring.service;

import com.spring.dao.UserDao;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    // 利用set实现值的动态注入
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    // 实际调用的是dao的方法
    public void getUser() {
        userDao.getUser();
    }
}
