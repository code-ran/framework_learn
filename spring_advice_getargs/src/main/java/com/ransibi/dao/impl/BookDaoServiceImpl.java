package com.ransibi.dao.impl;


import com.ransibi.dao.BookDaoService;
import org.springframework.stereotype.Service;

@Service
public class BookDaoServiceImpl implements BookDaoService {
    @Override
    public void saveService() {
        System.out.println("saveService");
    }

    @Override
    public void updateService() {
        System.out.println("updateService");
    }

    @Override
    public String selectService(int a) {
        System.out.println("selectService");
        System.out.println(a/0);
        return "selectService";
    }

    @Override
    public void insertService() {
        System.out.println("insertService");
    }
}
