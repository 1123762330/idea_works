package demo.reflect;


import java.lang.reflect.Constructor;

public class ConstructorDemo {
    public static void main(String[] args) throws Exception {
        //获取class对象
        Class cls2 = Person.class;

        //获取构造器对象
        Constructor cons = cls2.getConstructor(String.class, int.class, String.class);
        //实例化类对象
        Object obj = cons.newInstance("张三", 23, "男");
        System.out.println(obj);
    }
}
