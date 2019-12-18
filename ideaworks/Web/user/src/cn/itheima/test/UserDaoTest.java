package cn.itheima.test;

import cn.itheima.dao.UserDao;
import cn.itheima.domain.User;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void testLogin(){
        User loginuser = new User();
        loginuser.setUserName("zly");
        loginuser.setPassword("123");


        UserDao dao = new UserDao();
        User user = dao.login(loginuser);

        System.out.println(user);
    }
    
}
