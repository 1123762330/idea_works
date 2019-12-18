package com.day06.practice.teacher;

public class Student {
    //定义变量
    private String name;
    private int age;
    private String content;

    //定义无参构造
    public Student() {
    }
    //定义有参构造

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String eat() {
        String c="吃饭";
        return c;
    }

    public String study() {
        String x="专心致志的听着面向对象的知识";
        return x;
    }
}
