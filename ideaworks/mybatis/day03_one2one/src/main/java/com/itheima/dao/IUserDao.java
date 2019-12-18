package com.itheima.dao;

import com.itheima.domain.User;
import java.util.List;

/**
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 *
 * 用户的持久层接口
 */
public interface IUserDao {
    //查询所有用户
    List<User> findAll2();

    // 根据id查询用户信息
    User findById(Integer userId);


}
