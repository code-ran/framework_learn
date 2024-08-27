package com.ransibi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//在配置类上添加@Configuration注解，将其标识为一个配置类,替换applicationContext.xml
//在配置类上添加包扫描注解@ComponentScan替换<context:component-scan base-package=""/>
@Configuration
@ComponentScan("com.ransibi")
public class SpringConfig {
}
