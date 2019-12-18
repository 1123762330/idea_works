package com.itheima.service.impl;

import com.itheima.dao.UserDao;

import com.itheima.dao.UserDaoImpl;
import com.itheima.domain.User;
import com.itheima.service.UserService;


public class UserServiceImpl implements UserService {
    private UserDao dao=new UserDaoImpl();


    @Override
    public User login(User loginUser) {

        return dao.login(loginUser);
    }
}
