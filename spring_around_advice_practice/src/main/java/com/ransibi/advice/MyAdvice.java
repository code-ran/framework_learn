package com.ransibi.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.ransibi.dao.*Service.*(..))")
    private void pt() {}

    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        Class declaringType = signature.getDeclaringType();
        String name = signature.getName();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            //表示对原始操作的调用
            pjp.proceed();
        }
        long watchTime = System.currentTimeMillis() - startTime;
        System.out.println(declaringType + "下" + name + "业务层千次执行耗时" + watchTime + "ms");
    }
}