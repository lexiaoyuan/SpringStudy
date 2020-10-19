package com.spring.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect  //标注这个类为一个切面
public class AnnotationPointCut {
    //@Before：方法执行前，参数为表达式，定义切点位置
    @Before("execution(* com.spring.service.UserServiceImpl.*(..))")
    public void annoBefore(){
        System.out.println("方法执行前");
    }

    //@After：方法执行后，参数为表达式，定义切点位置
    @After("execution(* com.spring.service.UserServiceImpl.*(..))")
    public void annoAfter(){
        System.out.println("方法执行后");
    }


    // 在环绕增强中，给定一个参数ProceedingJoinPoint pjp，代表我们要执行的切入点
    @Around("execution(* com.spring.service.UserServiceImpl.*(..))")
    public void annoArround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前");
        pjp.proceed(); //执行方法
        System.out.println("环绕后");
    }
}
