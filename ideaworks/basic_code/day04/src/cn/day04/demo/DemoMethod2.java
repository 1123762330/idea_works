package cn.day04.demo;

public class DemoMethod2 {
    public static void main(String[] args) {
        methodPrint(5);//需要输出5次,那么就需要定义一个参数变量
        methodSum();

    }

    public static void  methodSum(){
        int rusult=3+4;
        System.out.println(rusult);
    }
    public static void methodPrint(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("你好"+i);
        }
    }
}
