package cn.day10.practice.test2;
/*5.定义青蛙类:
        行为:
        吃饭(吃虫子)和 游泳(蛙泳)*/
public class Frog extends  Animal implements Swim {
    public Frog() {
    }

    public Frog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"吃虫子");
    }

    @Override
    public void swim() {
        System.out.println(getName()+"会蛙泳");
    }
}
