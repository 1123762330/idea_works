package cn.day10.demo.interfaceanimal;

public class InterfaceDemo {
    public static void main(String[] args) {
        //创建子类对象
        Animal a=new Animal();
        //调用实现后的方法
        a.eat();
        a.sleep();
    }
}
