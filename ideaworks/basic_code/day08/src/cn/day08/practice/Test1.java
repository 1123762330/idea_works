package cn.day08.practice;

import java.util.Scanner;

/*(1) 键盘录入一个String字符串例如:"   ab123cd   "，
        (2) 首先去除字符串两端的空白空格，然后截取出字符串中的最后3个字符并在控制台输出。
        (3) 例如: 最终显示的结果是  3cd*/
public class Test1 {
    public static void main(String[] args) {
        String str=new String();//创建字符串
        System.out.println("请输入字符串:");
        Scanner sc=new Scanner(System.in);//键入字符串
        str=sc.next();
        String str1=str.trim();//去掉前后空格获得新字符串
        String str4=str1.substring(str1.length()-3);//截取后三个字符
        System.out.println(str4);
    }
}
