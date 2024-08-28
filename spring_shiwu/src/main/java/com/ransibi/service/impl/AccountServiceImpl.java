package com.ransibi.service.impl;

import com.ransibi.dao.AccountDao;
import com.ransibi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;


    @Override
    public void transfer(Double out, Double in) {
        String name1 = "zhangsan";
        String name2 = "李四";
        accountDao.outMoney(name1,out);
//        int i = 1/0;
        accountDao.inMoney(name2,in);
//        accountDao.outMoney(name2,out);
////        int i = 1/0;
//        accountDao.inMoney(name2,in);
    }
}
