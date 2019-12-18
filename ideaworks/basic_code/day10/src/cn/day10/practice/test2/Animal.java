package cn.day10.practice.test2;
/*1.定义动物类:
        属性:
        年龄
        行为:
        喝水,吃东西(吃什么不确定)*/
public abstract class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void drink(){
        System.out.println("喝水");
    }
    public abstract void eat();
}
