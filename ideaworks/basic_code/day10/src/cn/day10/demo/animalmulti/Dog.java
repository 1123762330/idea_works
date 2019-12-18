package cn.day10.demo.animalmulti;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    public void watchHouse(){
        System.out.println("狗看家");
    }
}
