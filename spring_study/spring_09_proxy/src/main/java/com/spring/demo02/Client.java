package com.spring.demo02;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        //使用代理来做一些操作
        UserServiceProxyImpl userServiceProxy = new UserServiceProxyImpl();
        userServiceProxy.setUserService(userService);

        userServiceProxy.update();
    }
}
