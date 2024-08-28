package com.ransibi;


import com.ransibi.config.SpringConfig;
import com.ransibi.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = context.getBean(BookDao.class);
//        int select = bookDao.select();
//        System.out.println(select);
        bookDao.update();
    }
}