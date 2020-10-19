package com.spring.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类来自动生成代理类，这仅仅是一个处理程序
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;

    void setTarget(Object target) {
        this.target = target;
    }

    //生成代理类
    Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this );
    }

    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //反射机制，通过method的invoke方法实现动态代理
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }

    //新增日志方法
    private void log(String msg) {
        System.out.println("[Debug] 调用了"+msg+"方法");
    }

}