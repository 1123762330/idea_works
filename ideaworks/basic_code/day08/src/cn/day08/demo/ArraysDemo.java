package cn.day08.demo;

import java.util.Arrays;
//Arrays的直接转换和sort升序
public class ArraysDemo {
    public static void main(String[] args) {
        int[] array={23,2,18,4,5};
        System.out.println(Arrays.toString(array));//将整数数组直接转换成字符串数组,并打印输出
        Arrays.sort(array);//将数组直接升序
        System.out.println(Arrays.toString(array));//输出

    }
}
