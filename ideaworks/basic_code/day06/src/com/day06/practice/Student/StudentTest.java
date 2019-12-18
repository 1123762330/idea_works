package com.day06.practice.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student s1=new Student("周凌云",22,60);
        System.out.println(s1.getName()+s1.getAge()+" "+s1.getScore());
        s1.eat();
        s1.study();
    }
}
