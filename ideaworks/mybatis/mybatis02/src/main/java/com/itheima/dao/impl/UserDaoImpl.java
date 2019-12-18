package com.itheima.dao.impl;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements IUserDao {
    private SqlSessionFactory factory;
    private SqlSession session;

    public UserDaoImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }

    public List<User> findAll() {
        //1.根据factory获取SqlSession对象
        session=factory.openSession();
        //2.调用SqlSession中的方法,实现查询列表
        List<User> users = session.selectList("com.itheima.dao.IUserDao.findAll");
        //3.释放资源
        session.close();
        return users;
    }

    public void saveUser(User user) {
        //1.根据factory获取SqlSession对象
        session=factory.openSession();
        //调用方法实现保存
        session.insert("com.itheima.dao.IUserDao.saveUser",user);
        //3.提交事务
        session.commit();
        //4.释放资源
        session.close();
    }

    public void UpdateUser(User user) {
        //1.根据factory获取SqlSession对象
        session=factory.openSession();
        //调用方法实现保存
        session.insert("com.itheima.dao.IUserDao.UpdateUser",user);
        //3.提交事务
        session.commit();
        //4.释放资源
        session.close();

    }

    public void deleteUser(Integer userId) {
        //1.根据factory获取SqlSession对象
        session=factory.openSession();
        //调用方法实现保存
        session.insert("com.itheima.dao.IUserDao.deleteUser",userId);
        //3.提交事务
        session.commit();
        //4.释放资源
        session.close();
    }

    public User findById(Integer userId) {
        //1.根据factory获取SqlSession对象
        session=factory.openSession();
        //2.调用SqlSession中的方法,实现查询列表
        User user = session.selectOne("com.itheima.dao.IUserDao.findById",userId);
        //3.释放资源
        session.close();
        return user;
    }

    public List<User> findByName(String username) {
        //1.根据factory获取SqlSession对象
        session = factory.openSession();
        //2.调用SqlSession中的方法，实现查询列表
        List<User> users = session.selectList("com.itheima.dao.IUserDao.findByName",username);
        //3.释放资源
        session.close();
        return users;
    }

    public int findTotal() {
        //1.根据factory获取SqlSession对象
        session = factory.openSession();
        //2.调用SqlSession中的方法，实现查询一个
        Integer count = session.selectOne("com.itheima.dao.IUserDao.findTotal");
        //3.释放资源
        session.close();
        return count;
    }
}
