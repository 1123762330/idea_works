package cn.day07.demo;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //定义一个Scanner对象
        Scanner sc = new Scanner(System.in);

        //定义一个变量来接收键盘数据
        int num = sc.nextInt();
        System.out.println("num=" + num);

        String str = sc.next();//中间有空格只取空格前面的数据
        System.out.println("str= " + str);

        String str1 = sc.nextLine();//输出一整行数据
        System.out.println("st2=" + str1);

    }
}
