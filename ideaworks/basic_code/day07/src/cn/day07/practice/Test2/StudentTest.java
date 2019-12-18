package cn.day07.practice.Test2;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        //创建学生对象信息
        Student stu = new Student("小红", 12, "小学");
        Student stu1 = new Student("小米", 21, "大学");
        Student stu2 = new Student("小明", 14, "初中");
        //将对象存到集合中
        list.add(stu);
        list.add(stu1);
        list.add(stu2);
        //遍历输出
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);//创建学生对象接收遍历后的具体数据
            if (s.getAge() < 15) {
                s.setSchool("幼儿园");//如果年龄小于15岁,修改学校
            }
            System.out.println(s.getName() + "-" + s.getAge() + "-" + s.getSchool());

        }
    }
}
