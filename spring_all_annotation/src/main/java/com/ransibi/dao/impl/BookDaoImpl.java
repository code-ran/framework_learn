package com.ransibi.dao.impl;

import com.ransibi.dao.BookDao;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class BookDaoImpl implements BookDao {
    public BookDaoImpl(){
        System.out.println("BookDaoImpl无参构造");
    }
    public void save() {
        System.out.println("book dao save ..." );
    }

    //在构造方法之后执行，替换 init-method
    @PostConstruct
    public void init() {
        System.out.println("init ...");
    }

    //在销毁方法之前执行,替换 destroy-method
    @PreDestroy
    public void destroy() {
        System.out.println("destroy ...");
    }
}
