package cn.day06.student;

public class TestStudent {
    public static void main(String[] args) {
        //无参构造方式使用
        Student stu1=new Student();

        //有参构造方法调用
        Student stu2=new Student("赵丽颖",26);
        System.out.println(stu2.getName()+stu2.getAge());

        // 如果需要改变对象当中的成员变量数据内容，仍然还需要使用setxxx方法
        stu1.setName("周凌云");
        stu1.setAge(22);
        System.out.println(stu1.getName()+stu1.getAge());
    }
}
