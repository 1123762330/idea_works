package cn.day08.demo;

import java.util.Scanner;

public class TongJiString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();//键入字符串
        char[] chars=s.toCharArray();//将键入的字符串转换成字符节

        int big=0;
        int min=0;
        int number=0;
        int qita=0;

        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>='a' && chars[i]<='z'){
                big++;
            }else if(chars[i]>='A' && chars[i]<='Z'){
                min++;
            }else if(chars[i]>='0' && chars[i]<='9'){
                number++;
            }else{
                qita++;
            }
        }

        System.out.println("大写字符有"+big);
        System.out.println("小写字符有"+min);
        System.out.println("数字字符有"+number);
        System.out.println("其他字符有"+qita);
    }
}
