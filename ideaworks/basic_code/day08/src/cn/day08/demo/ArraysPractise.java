package cn.day08.demo;

import java.util.Arrays;

public class ArraysPractise {
    public static void main(String[] args) {
        String s="sgdflgfhbkjcjk48934975FGRHLGSBS";//定义字符串
        char[] chars=s.toCharArray();//转换成字符数组
        Arrays.sort(chars);//对字符数组进行升序
        //倒序输出
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]+" ");
        }
    }
}
