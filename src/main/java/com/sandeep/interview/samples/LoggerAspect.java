package com.sandeep.interview.samples;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Sandeep on 1/31/2017.
 */
@Aspect
public class LoggerAspect {

    @Before("allGetter()")
    public void logDetails(){
        System.out.println("AOP @Before");

    }

    @Pointcut("execution(* get*())")
    public void allGetter(){
        System.out.println("AOP gettter point cut");
    }
}
