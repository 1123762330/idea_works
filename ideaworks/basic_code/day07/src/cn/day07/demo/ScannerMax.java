package cn.day07.demo;

import java.util.Scanner;

public class ScannerMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int a=sc.nextInt();
        System.out.println("请输入第二个数字:");
        int b=sc.nextInt();
        System.out.println("请输入第三个数字:");
        int c=sc.nextInt();

        //进行置换比较
        int temp=a>b?a:b;
        int max=temp>c?temp:c;
        System.out.println("最大值是:"+max);

        //按照从小到大的顺序排列
        if(a>b){
            temp=a;
            a=b;
            b=temp;
        }
        if(a>c){
            temp=a;
            a=c;
            c=temp;
        }
        if(b>c){
            temp=b;
            b=c;
            c=temp;
        }
        System.out.println("从小到大的顺序是:"+a+" "+b+" "+c);
    }
}
