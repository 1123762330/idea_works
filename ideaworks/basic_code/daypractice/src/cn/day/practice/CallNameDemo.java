package cn.day.practice;

import java.util.Random;

public class CallNameDemo {
    public static void main(String[] args) {
        //定义数组
        String[] name=new String[6];
        //获取添加学生方法
        addStudent(name);
        //调用遍历数组方法
        printStudent(name);
        //调用随机索引方法
        String student=randomStudent(name);
        System.out.println("随机抽中的学生是:"+student);
    }

    //定义遍历数组方法
    public static void printStudent(String[] name) {
        for(int i=0;i<name.length;i++) {
            System.out.println(name[i]);
        }
    }

    //定义一个随机数方法,用来做索引
    public static String randomStudent(String[] name) {
        Random ran=new Random();
        int index=ran.nextInt(name.length);
        return name[index];
    }

    //定义添加学生名称方法
    public static void addStudent(String[] name) {
        name[0]="张三";
        name[1]="李四";
        name[2]="王五";
        name[3]="大哥";
        name[4]="二哥";
        name[5]="三弟";
    }
}
