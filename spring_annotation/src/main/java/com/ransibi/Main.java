package com.ransibi;


import com.ransibi.dao.BookDao;
import com.ransibi.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();
        BookService bookService = (BookService) ctx.getBean("bookServiceImpl");
//        BookService bookService = (BookService) ctx.getBean(BookService.class);
        bookService.save();
    }
}
