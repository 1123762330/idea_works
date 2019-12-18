package com.itheima.demo1;
/*
	学生类Student
			属性:
					姓名name
					年龄age
					成绩score
			行为:
					吃饭eat()
					学习study()
 */
public class Student {
    private String name;
    private int age;
    private int socre;

    public Student() {
    }

    public Student(String name, int age, int socre) {
        this.name = name;
        this.age = age;
        this.socre = socre;
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

    public int getSocre() {
        return socre;
    }

    public void setSocre(int socre) {
        this.socre = socre;
    }

    //吃饭eat()
    public void eat(){
        System.out.println("吃饭");
    }
    //	学习study()
    public void study(){
        System.out.println("学习");
    }
}
