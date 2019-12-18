package cn.Test7;

import java.util.Arrays;
import java.util.Scanner;

/*编写一个Java程序，提示用户输入一串字符串，要求字符串中必须存在字母（需要代码判断）
        1.若不符合要求，则提示用户重新输入直至符合要求为止
        2.若符合要求，则求字符串中大写字母出现的次数并打印*/

public class Test7 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一串字符串:");
            int count = 0;//当字符串中有字母,那么就记一次次数
            int count1 = 0;//当符合题目要求,只有大写字母的字数
            String str;//定义一个字符串
            while (true){
                str = sc.nextLine();//键入一行字符串
                char[] chars = str.toCharArray();//将字符串转换成字符数组

                for (int i = 0; i < chars.length; i++) {//遍历字符数组
                    char ch = chars[i];//得到具体的字符数据
                    if ((ch>='A' && ch<'Z') || (ch>='a' && ch<'z' ) ){
                        count++;
                    }
                    if(ch>='A' && ch<'Z'){//如果有大写字母
                        count1++;//次数加一
                    }

                }
                if (count == 0 ){//如果字母字数为0次,则需要重新输入数值
                    System.out.println("您输入的不符合要求,请重新输入:");
                }else {
                    break;//如果有字母,但是没有大写字母就结束程序
                }
            }
            System.out.println("大写字母的次数为:"+count1);
        }
}

