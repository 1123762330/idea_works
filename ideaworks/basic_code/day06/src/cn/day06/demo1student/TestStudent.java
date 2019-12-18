package cn.day06.demo1student;

public class TestStudent {
    public static void main(String[] args) {
        //创建实例
        Student stu=new Student();

        //访问成员变量
        stu.name="周凌云";
        stu.age=22;

        System.out.println(stu.name+" "+stu.age);

        //访问成员方法
        stu.eat();
        stu.sleep();
        stu.study();
    }
}
