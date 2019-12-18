package cn.day09.practice.test3;

public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("学生正在兴奋的搞学习");
    }
}
