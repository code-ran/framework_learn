package com.ransibi.dao.impl;

import com.ransibi.dao.BookDao;
import org.springframework.stereotype.Service;

@Service
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("book dao save ...");
    }

    @Override
    public void update() {
//        int b = 100/0;
        System.out.println("book dao update ...");
    }

    @Override
    public int select() {
        System.out.println("select is running");
//        int a = 1/0;
        return 100;
    }
}
