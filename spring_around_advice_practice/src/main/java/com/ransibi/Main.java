package com.ransibi;


import com.ransibi.config.SpringConfig;
import com.ransibi.dao.BookDaoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDaoService bookDao = context.getBean(BookDaoService.class);
        bookDao.selectService();
    }
}