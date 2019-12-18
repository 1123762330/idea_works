package cn.day08.demo;

import java.util.Scanner;
//统计字符个数
public class StringTongJi {
    public static void main(String[] args) {
        //从键盘录入数据
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //定义三个统计变量
        int bigCount=0;
        int smallCount=0;
        int numberCount=0;
        //遍历输入的字符数组
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            //拿字符进行判断
            if(ch>='A' && ch<='Z'){
                bigCount++;
            }else if(ch>='a' && ch<='z'){
                smallCount++;
            }else if (ch>='0' && ch<='9'){
                numberCount++;
            }else{
                System.out.println("该字符串"+ch+"不合法");
            }
        }

        //输出结果
        System.out.println("大写字符"+bigCount+"个");
        System.out.println("小写字符"+smallCount+"个");
        System.out.println("数字字符"+numberCount+"个");
    }
}
