package com.day06.practice.teacher;
/*属性:
        姓名name
        年龄age
        讲课内容content
        行为:
        吃饭
        讲课
*/
public class Teacher {
    private String name;
    private int age;
    private String content;

    public Teacher() {
    }

    public Teacher(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public  String jianKe(){
        String s="亢奋的讲着Java基础中面向对象的知识";
        return s;
    }

    public  String eat(){
        String s="吃饭";
        return s;
    }
}
