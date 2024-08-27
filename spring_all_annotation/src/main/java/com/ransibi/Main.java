package com.ransibi;


import com.ransibi.config.SpringConfig;
import com.ransibi.dao.BookDao;
import com.ransibi.service.BookService;
import com.ransibi.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        BookDao bookDao = (BookDao) ctx.getBean(BookDao.class);
//        BookDao bookDao1 = (BookDao) ctx.getBean(BookDao.class);
//        System.out.println(bookDao);
//        System.out.println(bookDao1);
        BookServiceImpl bookService = ctx.getBean(BookServiceImpl.class);
        bookService.save();
        //注册关闭的钩子
        ctx.close();
    }
}
