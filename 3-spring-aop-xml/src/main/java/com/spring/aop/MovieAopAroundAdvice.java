package com.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;
import java.sql.SQLOutput;

public class MovieAopAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        try {
            //BEFORE
            LOG("**** ADVICE BEFORE >>" + invocation.getMethod().getName());


            //Call funtion
            Object result = invocation.proceed();


            //AFTER
            LOG("**** ADVICE AFTER >>" + result);


            return result;
        } catch (Exception e) {
            //THROW EXCEPTION
            e.printStackTrace();
            throw e;
        }

    }

    private static void LOG(String text){
        System.out.println(text);
    }
}
