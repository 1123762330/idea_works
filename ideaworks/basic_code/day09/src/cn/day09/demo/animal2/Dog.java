package cn.day09.demo.animal2;

public abstract class Dog extends Animal{//狗继承动物类

    @Override
    public void eat() {//狗重写动物类中的吃饭方法
        System.out.println("狗吃骨头");
    }

    /*public void sleep(){
        System.out.println();
    }*/
}
