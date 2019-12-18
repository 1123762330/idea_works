package cn.itheima.test6;
/*a.定义抽象类: 人类Person，要求包含：
        1)成员变量：姓名 name (String类型)， 年龄  age  (int类型);
        2)提供方法:空参、满参构造方法；get和set方法
        3)抽象方法：sleep();*/

public abstract class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void sleep();

}

