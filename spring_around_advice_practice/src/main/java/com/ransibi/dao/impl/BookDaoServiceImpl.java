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
    public void selectService() {
        System.out.println("selectService");
    }

    @Override
    public void insertService() {
        System.out.println("insertService");
    }
}
