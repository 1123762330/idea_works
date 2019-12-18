package com.itheima.test1;

import java.util.ArrayList;
import java.util.Scanner;

/*
提示用户输入5个100-200（包含100和200）之间的数字（数字可以重复），
如果输入的数字范围不对，提示“数字超出范围，请重新输入”，如果输入的数字符合要求，
则判断是奇数还是偶数，将偶数存入到一个集合，将奇数存入到另一个集合中，并按要求打印集合元素
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("请输入5个100-200之间的数字");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();//偶数集合
        ArrayList<Integer> list2 = new ArrayList<>();//奇数集合
        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入第" + i + "个数:");
            int num = sc.nextInt();
            if (num < 100 || num > 200) {
                while (num < 100 || num > 200) {
                    System.out.println("数字超出范围,请重新输入");
                    num = sc.nextInt();
                }
            }
            if (num >= 100 && num <= 200) {
                if (num % 2 == 0) {
                    list1.add(num);//如果是偶数就放在偶数集合里
                } else {
                    list2.add(num);//反之就放在奇数集合里
                }
            }
        }

        //输出集合
        System.out.println("偶数集合元素有:");
        System.out.println(list1);
        System.out.println("奇数集合元素有:");
        System.out.println(list2);

    }
}
