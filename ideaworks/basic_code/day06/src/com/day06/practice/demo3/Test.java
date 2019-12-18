package com.itheima.demo3;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher("大鹏", 30, "java基础面向对象");
        t.eat();
        t.teach();
        Student s = new Student();
        s.setName("小辉辉");
        s.setAge(18);
        s.setContent("面向对象");
        s.eat();
        s.study();
    }
}
