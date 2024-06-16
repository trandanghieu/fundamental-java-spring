package com.spring.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MovieAopBeforeAdvice  implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("*** MovieAopBeforeAdvice >> BEFORE >> LOGIN...");
    }

}
