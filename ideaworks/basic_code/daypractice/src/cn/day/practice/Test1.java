package cn.day.practice;

import java.util.ArrayList;
import java.util.Scanner;

/*提示用户输入5个100-200（包含100和200）之间的数字（数字可以重复），如果输入的数字范围不对，
提示“数字超出范围，请重新输入”，如果输入的数字符合要求，则判断是奇数还是偶数，
将偶数存入到一个集合，将奇数存入到另一个集合中，并按要求打印集合元素.*/
public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//创建Scanner对象类,从键盘输入
        ArrayList<Integer> even= new ArrayList<>();//创建偶数集合
        ArrayList<Integer> odd= new ArrayList<>();//创建奇数集合

        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入第"+i+"个数:");
            int num=sc.nextInt();
            //判断数字是否超出范围
            if (num<100|| num>200){
                while (num<100|| num>200) {
                    System.out.println("数字超出范围,请重新输入");
                    num=sc.nextInt();
                }
            }else {
                System.out.println(num);
            }

            //判断数字是否为偶数
            if(num>=100&&num<=200){
                if(num%2==0){//如果添加的数为偶数,添加到偶数集合
                    even.add(num);
                }else{
                    odd.add(num);//否则就为奇数,添加到奇数集合
                }
            }
        }

        System.out.println("偶数集合元素为:");
        for (int i = 0; i < even.size(); i++) {
            int e=even.get(i);
            System.out.print(e+" ");
        }
        System.out.println();//换行

        System.out.println("奇数集合元素为:");
        for (int i = 0; i < odd.size(); i++) {
            int oddnum=odd.get(i);
            System.out.print(oddnum+" ");
        }


    }
}
