package com.itheima.test;

/*
 * 定义一个方法printNum, 求1-500之内能同时被2，5，7整除的所有数 ,打印格式要求2个一行打印输出,
 * 并统计满足条件的个数, 在主方法中调用此方法完成测试.
 * */
public class Test4 {
    public static void main(String[] args) {
        printNum();
    }

    public static void printNum() {
        int n = 0;
        for (int i = 1; i <= 500; i++) {
            if (i % (2 * 5 * 7) == 0) {
                n++;
                System.out.print(i + ",");
                if (n % 2 == 0) {
                    System.out.println();
                }
            }

        }
        System.out.println(n);


    }
}
