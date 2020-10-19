package com.spring.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类来自动生成代理类，这仅仅是一个处理程序
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

    void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成代理类
    Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this );
    }

    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //反射机制，通过method的invoke方法实现动态代理
        seeHouse();
        Object result = method.invoke(rent, args);
        charge();
        return result;
    }

    private void seeHouse(){
        System.out.println("中介带你看房子");
    }

    private void charge(){
        System.out.println("中介收中介费");
    }
}

