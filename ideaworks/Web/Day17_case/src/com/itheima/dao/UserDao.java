package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * d定义查询所有用户的方法
     * @return
     */
    public List<User> findAll();

    /**
     * 定义添加用户的方法
     * @param user
     */
    public void addUser(User user);

     User loginuser(String username, String password);

    void deleteUser(int id);

    void updateUser(User user);

    User findById(int id);


    int findTotalCount();

    List<User> findByPage(int start, int rows);
}
