package com.itheima.ui;

import com.itheima.dao.IAccountDao;
import com.itheima.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Client {
    public static void main(String[] args) {
        //1.获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //加载磁盘路径
        //ApplicationContext ac = new FileSystemXmlApplicationContext("D :\\CoCo\\ideaworks\\spring\\spring01\\src\\main\\resources\\bean.xml");
        //2.根据id获取Bean对象(两种方式)
        IAccountService as = (IAccountService) ac.getBean("accountService");
        IAccountDao adao = ac.getBean("accountDao", IAccountDao.class);
        System.out.println(as);
        System.out.println(adao);
    }
}
