package cn.day10.demo.interfacedemo;

public interface MyInterface {
    void method();
    void method2();
    void method3();
    //新添加一个方法为默认方法
    default void defaultMethod(){
        System.out.println("这里可以放新的方法体,不会影响实现类");
    }
}
