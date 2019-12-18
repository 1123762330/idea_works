package cn.day06.demo2phone;

public class Phone {
    //定义成员变量
    String brand;
    double price;
    String color;

    //定义成员方法
    public void call(String name){
        System.out.println("给"+name+"打电话");
    }

    public void message(){
        System.out.println("发短信");
    }
}
