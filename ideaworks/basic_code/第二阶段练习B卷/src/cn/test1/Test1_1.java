package cn.test1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1_1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第"+(i+1)+"个数");
            int num = sc.nextInt();
            if (num<100 ||num>200){
                i--;
                System.out.println("数字超出范围，请重新输入");
            }else if (num % 2 == 0){
                list1.add(num);
            }else{
                list2.add(num);
            }
        }
        System.out.println("偶数集合元素为:"+list1);
        System.out.println("奇数集合元素为:"+list2);
    }
}
