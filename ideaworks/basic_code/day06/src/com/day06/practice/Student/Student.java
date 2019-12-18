package com.day06.practice.Student;
/*属性:
        姓名name  年龄age  成绩score
        行为:吃饭eat()  学习study()
*/
public class Student {
    //定义变量
    private String name;
    private int age;
    private  int score;
    //定义无参构造
    public Student() { }
    //定义有参构造

    public Student(String name,int age, int score) {
        this.name = name;
        this.age=age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void eat(){
        System.out.println("吃饭啦!");
    }
    public void study(){
        System.out.println("我要开始好好学习啦!");
    }
}
