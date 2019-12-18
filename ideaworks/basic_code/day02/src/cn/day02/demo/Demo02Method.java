package cn.day02.demo;

public class Demo02Method {
    public static void main(String[] args){
        farmer();
        cook();
        me();
    }
    public static void farmer() {
        System.out.println("你负责种田");
    }
    public static void cook(){
        System.out.println("厨师负责做饭");
    }
    public static void me(){
        System.out.println("我只负责吃");
    }
}
