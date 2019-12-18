package com.itheima.dao;

import com.itheima.domain.AdminUser;
import com.itheima.domain.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    /*查找所有用户*/
    List<User> findAll();

    /*用户登录*/
    AdminUser login(AdminUser adminUser);

    /*用户注册*/
    int register(User user);

    /*用户删除*/
    int deleteUser(int id);

    /*批量删除用户*/
    void deleteSelectUser(int id);

    /*回显用户信息*/
    User findUser(int id);

    /*修改用户信息*/
    void updateUser(User user);
    //查询总记录数
    int findToTalCount(Map<String, String[]> condition);
    //查询每页记录
    List<User> findByPage(int start, int rows, Map<String, String[]> condition);
}
