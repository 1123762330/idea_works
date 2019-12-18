package cn.day10.demo.interfaceextends;

public class MyImplement implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("我自己的方法");
    }

    @Override
    public void methodA() {
        System.out.println("我是妈妈");
    }

    @Override
    public void methodB() {
        System.out.println("我是爸爸");
    }
}
