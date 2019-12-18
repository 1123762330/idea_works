package cn.day10.demo.animalmulti;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
