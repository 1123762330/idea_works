package cn.day09.demo.animal2;

public class HaHaDog extends Dog {//二哈类继承狗类

    @Override
    public void sleep() {//二哈类重写动物类中的睡觉抽象方法
        System.out.println("呼呼呼的睡觉");
    }
}
