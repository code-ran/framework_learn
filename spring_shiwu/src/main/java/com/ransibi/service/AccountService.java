package com.ransibi.service;


import org.springframework.transaction.annotation.Transactional;

public interface AccountService {
    //配置当前接口方法具有事务
    @Transactional
    public void transfer(Double out, Double in) ;
}
