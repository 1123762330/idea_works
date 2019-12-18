package com.itheima.test;

import com.itheima.dao.IUserDao;
import com.itheima.domain.QueryVo;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MybatisCDUR {
    private InputStream in;
    private SqlSession session;
    private IUserDao userDao;
    private SqlSessionFactoryBuilder builder;
    private SqlSessionFactory factory;

    //配置头文件
    @Before //测试之前执行
    public void init() throws IOException {
        //1.读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        builder = new SqlSessionFactoryBuilder();
        factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        session = factory.openSession( true);
        //4.使用SqlSession创建Dao接口代理对象
        userDao = session.getMapper(IUserDao.class);
    }

    //配置底文件
    @After //测试之后执行
    public void destroy() throws Exception {
        /*session.commit();*/
        //6.释放资源
        session.close();
        in.close();
    }

    //查询所有
    @Test
    public void testfindAll() {
        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    //添加用户
    @Test
    public void testSave() {
        User user = new User(null, "周凌云3", new Date(), "男", "武汉市");
        System.out.println("保存之前:"+user);
        //5.使用代理对象执行方法
        userDao.saveUser(user);
        System.out.println("保存之后:"+user);
    }

    //更新用户
    @Test
    public void testUpdate() {
        User user = new User(49, "周凌云", new Date(), "女", "武汉市");
        //5.使用代理对象执行方法
        userDao.UpdateUser(user);
    }

    //删除用户
    @Test
    public void testDelete() {
        //5.使用代理对象执行方法
        userDao.deleteUser(46);
    }

    //根据id查找用户
    @Test
    public void testFindById(){
      User user=userDao.findById(48);
        System.out.println(user);
    }

    //根据名称模糊查询
    @Test
    public void testFindByName(){
        /*List<User> list=userDao.findByName("王");*/
        List<User> list=userDao.findByName("%王%");
        for (User user : list) {
            System.out.println(user);
        }
    }

    //查询用户总数
    @Test
    public void findTotal(){
        int count = userDao.findTotal();
        System.out.println("用户总数量:"+count);
    }

    //根据名称模糊查询
    @Test
    public void FindByVo(){
        QueryVo vo = new QueryVo();
        User user = new User();
        user.setUsername("%王%");
        vo.setUser(user);
        List<User> list=userDao.findUserByVo(vo);
        for (User u : list) {
            System.out.println(u);
        }
    }


}
