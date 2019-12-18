package demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws Exception {
        //获取class对象三种方法

        //类名.class,多用于参数传递
        Class cls2 = Person.class;

        //加载全类名,多用于配置文件,加载,读取
        Class cls = Class.forName("demo.reflect.Person");

        //对象.getClass(),多用于对象获取字节码文件
        Person p = new Person();
        Class cls3 = p.getClass();

        //获取所有public修饰的成员变量
        Field[] fields = cls2.getFields();
        //获取所有成员变量
        Field[] fields1 = cls2.getDeclaredFields();
        //获取指定的成员变量
        Field field = cls2.getField("sex");
        //实例化对象
        Object obj = cls2.newInstance();
        //赋值或者取值
        field.set(obj,"男");//设置值
        Object value = field.get(obj);//获取值

        //获取构造器对象并实例化类对象
        Constructor cons = cls2.getConstructor(String.class, int.class, String.class);
        Object obj2 = cons.newInstance("张三", 23, "男");

        //无参方法
        Method method = cls2.getMethod("eat");//获取public修饰的方法
        Method method2 = cls2.getDeclaredMethod("show");//使用暴力注解必须使用获取全部方法来调用
        method2.setAccessible(true);
        //有参方法
        Method method1 = cls2.getMethod("eat", String.class);

        //获取类名
        String name = cls2.getName();


        //显示结果
        method.invoke(obj);//无参方法,公共
        method1.invoke(obj,"水果");//有参方法
        method2.invoke(obj);//暴力破解
        System.out.println("成员变量:"+value);
        System.out.println("构造方法:"+obj2);
        System.out.println("获取类名方法:"+name);
    }
}
