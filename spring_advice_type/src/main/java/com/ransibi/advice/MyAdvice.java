package com.ransibi.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.ransibi.dao.BookDao.update())")
    private void pt(){}

    @Pointcut("execution(int com.ransibi.dao.BookDao.select())")
    private void pt1(){}

//    //前置通知
//    @Before("pt()")
//    public void before() {
//        System.out.println("前置通知");
//    }
//
//    //后置通知
//    @After("pt()")
//    public void after() {
//        System.out.println("后置通知");
//    }

    //环绕通知
    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        //环绕通知需要在原始方法的前后进行增强，所以环绕通知就必须要能对原始操作进行调用
        System.out.println("around before advice ...");
        //表示对原始操作的调用
        Object ret = pjp.proceed();
        System.out.println("around after advice ...");
        return ret;
    }

//
//    @Around("pt1()")
//    public Object around1(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("around before advice ...");
//        //表示对原始操作的调用
//        Object ret = pjp.proceed();
//        System.out.println("around after advice ...");
//        return ret;
//    }
//
//    @AfterReturning("pt1()")
//    public void afterReturning() {
//        System.out.println("返回后通知");
//    }
//
//    @AfterThrowing("pt1()")
//    public void afterThrowing() {
//        System.out.println("异常后通知");
//    }
}