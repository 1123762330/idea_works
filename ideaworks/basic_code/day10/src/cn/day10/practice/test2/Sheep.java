package cn.day10.practice.test2;
/*4.定义羊类:
        行为:
        吃饭(羊啃草)*/
public class Sheep extends Animal {
    public Sheep() {
    }

    public Sheep(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(getName()+"啃草");
    }

}
