package cn.itheima.test6;
/*1)继承Person类，重写sleep方法，方法内打印输出“年龄为xx的yy学生正在教室睡午觉”
        2)构造方法:空参、满参构造方法；
        3)成员方法：playGame(),方法内输出“年龄为xx的yy学生在教室玩游戏被老师抓住了”
        PS:xx为变量age的值，yy为变量name的值*/

public  class Student extends Person {
    public Student() {
    }

    public Student(int age, String name) {
        super( name,age);
    }

    @Override
    public void sleep() {
        System.out.println("年龄为"+getAge()+"的"+getName()+"学生正在教室睡午觉");
    }

    public void playGame(){
        System.out.println("年龄为"+getAge()+"的"+getName()+"学生在教室玩游戏被老师抓住了");
    }
}
