package com.ransibi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.ransibi")
//开启注解版AOP的功能
@EnableAspectJAutoProxy
public class SpringConfig {
}
