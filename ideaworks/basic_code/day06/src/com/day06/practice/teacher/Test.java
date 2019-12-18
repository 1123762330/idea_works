package com.day06.practice.teacher;

public class Test {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.setName("大鹏老师");
        teacher.setAge(30);
        System.out.println("年龄为"+teacher.getAge()+"的"+teacher.getName()+"正在"+teacher.eat()+"....");
        System.out.println("年龄为"+teacher.getAge()+"的"+teacher.getName()+"正在"+teacher.jianKe()+"....");

        Student stu=new Student("小辉辉",18);
        System.out.println("年龄为"+stu.getAge()+"的"+stu.getName()+"同学正在"+stu.eat()+"....  ");
        System.out.println("年龄为"+stu.getAge()+"的"+stu.getName()+"同学正在"+stu.study()+"....  ");
    }
}
