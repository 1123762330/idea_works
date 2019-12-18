package cn.day06.student;

public class Student {
    //成员变量
    private String name;
    private int age;

    //构造方法使用:构造方法用来初始化对象,并为成员变量赋初始值,
    public Student(){
        System.out.println("无参构造方法使用啦!");
    }
    public Student(String name , int age){//自定义有参构造方法
        System.out.println("全参构造方法被使用啦!");
        this.name=name;
        this.age=age;
    }

    //成员方法
    //即谁在调用,this就代表谁.
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }


}
