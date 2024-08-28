package com.ransibi.dao.impl;

import com.ransibi.dao.BookDao;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("book dao save ...");
    }

    @Override
    public void update() {
        System.out.println("book dao update ...");
    }
}
