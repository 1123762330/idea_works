package com.itheima.demo1;

public class TestStudent {
    public static void main(String[] args) {
        //无参构造
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(12);
        stu1.setSocre(90);
        System.out.println("姓名"+stu1.getName());
        System.out.println("年龄"+stu1.getAge());
        System.out.println("得分"+stu1.getSocre());
        stu1.eat();
        stu1.study();

        //全参构造
        Student stu2 = new Student("李四", 12, 54);
        System.out.println(stu2.getName()+" "+stu2.getAge()+" "+stu2.getSocre());
        stu2.eat();
        stu2.study();
    }
}
