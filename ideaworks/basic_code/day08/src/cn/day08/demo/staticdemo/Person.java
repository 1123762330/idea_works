package cn.day08.demo.staticdemo;

public class Person {
    int num;//成员变量
    static int numstatic;//静态成员变量

    public void method(){
        System.out.println("这是一个成员方法");
        System.out.println(num);//成员方法可以使用非成员变量
        System.out.println(numstatic);//也可以是使用静态成员变量
    }

    public  static void method2(){
        System.out.println("这是一个静态方法");
//        System.out.println(num);//静态方法不能使用非静态成员变量
        System.out.println(numstatic);//可以使用静态成员变量

    }
}
