package com.itheima.service;

import com.itheima.domain.AdminUser;
import com.itheima.domain.PageBean;
import com.itheima.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    //查询所有用户信息
    List<User> findAll();

    //管理员用户登录
    AdminUser login(AdminUser adminUser);

    //注册用户
    int register(User user);

    //删除选中用户
    int deleteUser(String id);

    //批量删除用户
    void delSelectedUser(String[] uids);

    //回显用户信息
    User findUserById(String id);

    //修改用户信息
    void updateUser(User user);

    //分页查询
    PageBean<User> findUserByPage(String _currentPage, String _rows, Map<String, String[]> condition);
}
