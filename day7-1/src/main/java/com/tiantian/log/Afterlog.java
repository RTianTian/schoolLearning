package com.tiantian.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class Afterlog implements AfterReturningAdvice {

    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("后置配置");
    }
}
