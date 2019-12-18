package com.itheima.test2;
/*
在main方法中，创建教师对象、学生对象并赋值
调用teaching()、getMyResult（）方法。
 */
public class Test2 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("张三","英语");
        Student student = new Student("王五",59,teacher);
        teacher.teaching();
        student.getMyResult();
    }
}
