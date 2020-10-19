package com.spring.demo03;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色：现在没有
        //实例化代理处理实例
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();

        //通过代理处理的实例来设置代理对象
        proxyInvocationHandler.setRent(host);

        //生成代理类的对象，这个对象是动态生成的
        Rent proxy = (Rent) proxyInvocationHandler.getProxy();

        //通过代理对象租房
        proxy.rent();
    }
}
