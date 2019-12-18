package cn.day08.practice;

import java.util.Scanner;

/*1) 键盘录入一个字符串数据
        (2) 查看该字符串数据当中,大写字母个数,小写字母个数,数字个数,其他字符个数
        (3) 例如:
        键盘录入的字符串如下:
        12##3AB爱Cab生活c7爱java89
        打印出来结果数据:
        大写字母个数: 3 个
        小写字母个数: 7 个
        数字字符个数: 6 个
        其他字符个数: 6 个*/
public class Test2 {
    public static void main(String[] args) {
        System.out.println("请输入字符串:");
        Scanner scanner = new Scanner(System.in);
        String s=scanner.next();
        //创建统计字符个数
        int big=0;
        int min=0;
        int number=0;
        int qita=0;
        //将字符串转换成字符数组
        char[] chars=s.toCharArray();
        //遍历字符数组
        for (int i = 0; i < chars.length; i++) {

            if(chars[i]>='A'&&chars[i]<='Z'){
                big++;
            }else if(chars[i]>='a'&&chars[i]<='z'){
                min++;
            }else if(chars[i]>='0'&&chars[i]<='9'){
                number++;
            }else{
                qita++;
            }
        }

        //输出结果
        System.out.println("大写字符个数:"+big+"个");
        System.out.println("小写字符个数:"+min+"个");
        System.out.println("数字字符个数:"+number+"个");
        System.out.println("其他字符个数:"+qita+"个");
    }
}
