package com.itheima.test;

/*
    在main方法中定义3个变量：int a = 50;  int b = 30;  int c = 80;
	并依次完成以下要求：
	1.定义方法getMax()利用if语句求出a、b、c中最大的数并打印到控制台上；
	2.定义方法getMin()利用三元运算符求出a、b、c中最小的数并打印到控制台上；

 */
public class Test1 {
    public static void main(String[] args) {
        int a = 50;
        int b = 30;
        int c = 80;
        int max = getMax(a, b, c);
        System.out.println("最大值为:" + max);
        int min = getMin(a, b, c);
        System.out.println("最小值为:" + min);
    }

    public static int getMax(int a, int b, int c) {
        int temp;
        int max;
        if (a > b) {
            temp = a;
        } else {
            temp = b;
        }
        if (temp > c) {
            max = temp;
        } else {
            max = c;
        }
        return max;
    }

/*public static  int max(int a,int b, int c){
    if (a>b && a>c){
        return a;
    }else if (b>a && b>c){
        return b;
    }else{
        return c;
    }
}*/


    public static int getMin(int a, int b, int c) {
        int min = a < b ? a : b;
        int min1 = min < c ? min : c;
        return min1;

    }
}

