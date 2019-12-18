package cn.day04.demo;

public class DemoPrint {
    public static void main(String[] args) {
        //调用方法 传递参数
        printHelloWorld(5);
    }

    //定义一个方法
    public static void printHelloWorld(int n){
        for(int i=0;i<n;i++){
            System.out.println("HelloWorld");
        }
    }
}
