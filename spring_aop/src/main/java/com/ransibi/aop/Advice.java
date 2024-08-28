package com.ransibi.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
//告诉spring这个类是用作aop的
@Aspect
public class Advice {

    //定义通知
    @Pointcut("execution(void com.ransibi.dao.BookDao.update())")
    private void pointCut() {}

    //通知和切入点绑定
    @Before("pointCut()")
    public void method() {
        System.out.println(System.currentTimeMillis());
    }
}
