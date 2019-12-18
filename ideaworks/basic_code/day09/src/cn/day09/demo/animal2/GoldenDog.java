package cn.day09.demo.animal2;

public class GoldenDog extends Dog{//黄金狗继承狗类
    @Override
    public void sleep() {//黄金狗类重写动物类的睡觉抽象方法
        System.out.println("抱着睡觉");
    }
}
