package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface IUserDao {
    //查询所有操作
    List<User> findAll();

    //添加数据
    public void saveUser(User user);

    //更新数据
    public void UpdateUser(User user);

    //删除数据
    public void deleteUser(Integer userId);

    //根据id查询用户
    public User findById(Integer userId);

    //根据名称模糊查询用户
    public List<User> findByName(String username);

    //查询总用户数
    public int findTotal();
}