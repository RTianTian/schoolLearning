package com.tiantian.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Beforelog implements MethodBeforeAdvice {

    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("我是前置通知");
    }
}
