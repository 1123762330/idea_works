package cn.day06.standardstudent;

public class StudentTest {
    public static void main(String[] args) {
        //创建实例对象
        Student s=new Student();

        //为对象赋值
        s.setName("赵丽颖");//设置对象名字
        s.setAge(23);//设置对象年龄
        s.setMan(true);//判断性别

        Student s2=new Student("花千骨",24);
        System.out.println(s2.getName()+s2.getAge());

        //获取对象方法
        System.out.println(s.getName()+s.getAge()+s.isMan());
        s.eat("爸爸");

     }
}
