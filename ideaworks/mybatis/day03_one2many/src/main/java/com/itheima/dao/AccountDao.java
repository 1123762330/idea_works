package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountDao {
    //一对一测试
    List<Account> findAll2();
}
