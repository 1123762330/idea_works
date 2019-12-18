package cn.test4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*定义一个ArrayList集合存储10个数字, 这些数字为20到80之间(包含20和80)的随机数,
        键盘录入一个0到9(包含0和9)的数字n ,再随机生成一个30到70之间(包含30和70)随机数num,
        将集合中n索引的元素修改成num, 打印修改前和修改后集合中的元素.*/
public class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();//创建一个集合list

        Random ran=new Random();
        for (int i = 0; i < 10; i++) {
            int number=ran.nextInt(61)+20;//随机生成区间的数字作为集合元素

            //添加数据到集合中
            list.add(number);
        }

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            int num2=list.get(i);
            System.out.print(num2+" ");
        }

        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("请输入一个0~9的数字");
        int n=sc.nextInt();//这个为集合索引
        int num=ran.nextInt(41)+30;//随机生成一个替换的n索引的元素
        System.out.println("随机生成的数字是:"+num);
        //元素交换
        //list.set(n,num);
        /*//第二种方法
        list.remove(n);
        list.add(n,num);*/
        list.add(n,num);

        //交换后遍历输出
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
