package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IUserDao {
    //查询所有操作
    @Select("select * from user")
    List<User> findAll();

    //添加数据
    @Insert("insert into user(username,address,sex,birthday)values(#{username},#{address},#{sex},#{birthday})")
    void saveUser(User user);

    //更新数据
    @Update("update user set username=#{username},sex=#{sex},birthday=#{birthday},address=#{address} where id=#{id}")
    void UpdateUser(User user);

    //删除数据
    @Delete("delete from user where id=#{id} ")
    void deleteUser(Integer userId);

    //根据id查询用户
    @Select("select * from user WHERE id=#{userId}")
    public User findById(Integer userId);

    //根据名称模糊查询用户
    @Select(" select * from user where username like #{name}")
    public List<User> findByName(String username);

    //查询总用户数
    @Select(" select count(id) from user")
    public int findTotal();
}