package com.itheima.service.impl;

import com.itheima.domain.PageBean;
import com.itheima.domain.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> findAllUser();

    /**
     * 用户添加信息
     * @param user
     */
    public void addUser(User user);

    public User login(User user);

    void deleteUser(String id);

    void updateUser(User user);

    User findById(String id);

    void delSelectUsers(String[] ids);

    /**
     * 分页查询
     * @param currentPage
     * @param rows
     * @return
     */
    PageBean<User> findUserByPage(String currentPage, String rows);
}
