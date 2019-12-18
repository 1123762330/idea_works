package cn.day04.demo;

public class DemoSum {
    public static void main(String[] args) {
        sum(5, 6);//单独调用
        System.out.println(sum(5, 6));//打印调用
        //赋值调用
        int num = sum(3, 4);//定义一个变量来接收返回值
        System.out.println(num);//打印输出这个对象
    }

    //定义一个求和方法
    public static int sum(int a, int b) {
        //定义方法主体
        System.out.println("方法已经被调用!");
        int result = a + b;//定义一个变量用来接收结果值
        return result;//返回结果值给调用者
    }
}
