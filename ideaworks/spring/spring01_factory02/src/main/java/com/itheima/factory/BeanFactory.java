package com.itheima.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {
    //定义一个properties对象
    private  static Properties prop;

    //定义一个Map,用于存放我们要创建的对象,我们把它称之为容器
    private  static Map<String,Object> beans;

    //使用静态代码块为properties对赋值
    static {
        try {
            prop=new Properties();
            //获取properties文件的流对象
            InputStream in=BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            prop.load(in);
            //实例化容器
            beans = new HashMap<String, Object>();
            //取出配置文件中所有的key
            Enumeration keys = prop.keys();
            //遍历枚举
            while (keys.hasMoreElements()){
                //取出每个Key
                String key = keys.nextElement().toString();
                //根据key获取value
                String beanParh = prop.getProperty(key);
                //反射创建对象
                Object value = Class.forName(beanParh).newInstance();
                //把key和value存入容器中
                beans.put(key,value);
            }
        } catch (Exception e) {
            System.out.println("初始化properties文件失败了");
            //e.printStackTrace();
        }
    }

    //根据bean的名称获取bean对象(升级版)
    public static Object getBean(String beanName){
        return beans.get(beanName);
    }


    /*//根据bean的名称获取bean对象
    public static  Object  getBean(String beanName){
        Object bean=null;
        String beanPath = prop.getProperty(beanName);
        System.out.println(beanPath);
        try {
            bean = Class.forName(beanPath).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }*/

}
