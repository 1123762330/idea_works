package demo.reflect;

import java.lang.reflect.Method;

public class MethodDemo {
    public static void main(String[] args) throws Exception {
        //获取class对象
        Class cls2 = Person.class;

        //获取成员方法对象
        Person person = new Person();//实例化类对象

        //无参方法
        //Method method = cls2.getMethod("show");//获取公共方法
        Method method2 = cls2.getDeclaredMethod("show");//使用暴力注解必须使用获取全部方法来调用
        method2.setAccessible(true);

        //有参方法
        Method method1 = cls2.getMethod("eat", String.class);

        //执行方法
        //method.invoke(person);//无参方法,公共
        method1.invoke(person,"水果");//有参方法
        method2.invoke(person);//暴力破解

        //获取类名
        String name = cls2.getName();
        System.out.println(name);
    }
}
