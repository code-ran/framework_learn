package com.ransibi.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {
    //@Pointcut("execution(* com.ransibi.dao.*Service.*(..))")
    @Pointcut("execution(* com.ransibi.dao.*Service.selectService(*))")
    private void pt() {
    }

//    @Before("pt()")
//    public void before(JoinPoint jp) {
//        Object[] args = jp.getArgs();
//        System.out.println(Arrays.toString(args));
//        System.out.println("哈哈哈");
//    }

//    @Around("pt()")
//    public void around(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("around before");
//        Object[] args = pjp.getArgs();
//        System.out.println("接收到的参数"+Arrays.toString(args));
//        //表示对原始操作的调用
////        pjp.proceed();
//        //对参数进行处理，修改原始方法的参数
//        args[0] = 999;
//        pjp.proceed(args);
//        System.out.println("around after");
//    }


//    @Around("pt()")
//    public Object around1(ProceedingJoinPoint pjp) throws Throwable{
//        Object[] args = pjp.getArgs();
//        System.out.println(Arrays.toString(args));
//        args[0] = 666;
//        Object ret = pjp.proceed(args);
//        return ret;
//    }
//
//    @AfterReturning(value = "pt()",returning = "ret")
//    public void afterReturning(Object ret) {
//        System.out.println("afterReturning advice ..."+ret);
//    }

    //    @Around("pt()")
//    public Object around(ProceedingJoinPoint pjp) {
//        Object[] args = pjp.getArgs();
//        System.out.println(Arrays.toString(args));
//        args[0] = 666;
//        Object ret = null;
//        try {
//            ret = pjp.proceed(args);
//        } catch (Throwable e) {
//            System.out.println("有异常需要处理");
//            throw new RuntimeException(e);
//        }
//        return ret;
//    }
    @AfterThrowing(value = "pt()", throwing = "t")
    public void afterThrowing(Throwable t) {
        System.out.println("afterThrowing advice ..." + t);
    }
}