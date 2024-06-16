package com.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
/*
    Class anotated with @Aspect containt Advice and PointCut
    excution(
    access-mofifier?
    return-type-pattern
    declaring-type-pattern?
    method-name-pattern(param-pattern)
    throws-pattern
    )

 */

@Aspect
public class MovieLogAspect {

    @Before("execution(public * com.spring.service.*.*(..))")//excution is pointcut ||do beforeservice is advice
    public void doBeforeService(){
        LOG("Add LOG BEFORE MovieService methods");
    }

    public static void LOG(String text){
        System.out.println(text);
    }


}
