package cn.day06.standardstudent;

public class Student {
    //定义成员变量
    private  String name;
    private  int age;
    private  boolean man;

    //定义无参构造器
    public Student() {
    }

    //定义有参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //定义成员方法
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
        /*if(age<100&&age>0){
        this.age = age;
        }else{
            System.out.println("数据有误");
        }*/
        this.age = age;
    }

    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    //定义行为方法
    public void eat(String who){
        System.out.println(who+"在吃饭");
    }
}
