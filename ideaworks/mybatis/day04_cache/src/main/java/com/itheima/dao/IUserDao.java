package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.CacheNamespace;

import java.util.List;

//@CacheNamespace(blocking=true,implementation = org.mybatis.caches.redis.RedisCache.class)
public interface IUserDao {
    // 查询所有用户，同时获取到用户下所有账户的信息
    List<User> findAll();

    //根据id查询用户信息
    User findById(Integer userId);

    //更新用户信息
    void updateUser(User user);
}
