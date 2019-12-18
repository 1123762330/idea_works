package cn.day08.practice;

import java.util.Arrays;

/*(1) 定义一个字符串"123,456,789"
  (2) 定义一个方法，将该字符串传入，返回一个字符串"789,456,123"
  (3) 将返回的字符串打印到控制台上*/
public class Test3 {
    public static void main(String[] args) {
        String s ="123,456,789";
        String str2=stringMethod(s);
        System.out.println(str2);
    }

    public static String stringMethod(String s){
        //首先将字符串进行切割
        String[] str=s.split(",");//存入字符串数组中

        //将字符串反遍历输出
        String str1=" ";
        for (int i = str.length-1; i >= 0; i--) {
            if(i==0){
                str1+=str[i];
            }else{
                str1+=str[i]+",";
            }
        }
        return str1;

    }
}
