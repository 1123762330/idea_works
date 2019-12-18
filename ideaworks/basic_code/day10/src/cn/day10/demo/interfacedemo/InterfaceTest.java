package cn.day10.demo.interfacedemo;

public class InterfaceTest {
    public static void main(String[] args) {
        Implements plem = new Implements();//创建实现类对象
        plem.method();//调用抽象方法
        plem.method2();
        plem.method3();
        plem.defaultMethod();//可以直接调用默认方法
    }
}
