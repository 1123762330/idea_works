package cn.day10.practice.test2;
/*3.定义狗类:
        行为:
        吃饭(啃骨头)和 游泳(狗刨)*/
public class Dog extends Animal implements Swim {
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"啃骨头");
    }


    @Override
    public void swim() {
        System.out.println(getName()+"会狗刨");
    }
}
