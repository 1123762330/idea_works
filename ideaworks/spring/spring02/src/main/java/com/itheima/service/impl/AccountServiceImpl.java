package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Component("accountService")
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    //声明类对象
    //@Autowired
    //@Qualifier("accountDao2")
    @Resource(name = "accountDao2")
    private IAccountDao accountDao;

    @Value("张三")
    private String name;

    //空参构造
    public AccountServiceImpl(){
        System.out.println("对象创建了");
    }

    public void saveAccount() {
        accountDao.saveAccount();
    }
}
