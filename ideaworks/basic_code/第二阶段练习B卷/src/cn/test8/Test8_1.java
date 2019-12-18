package cn.test8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test8_1 {
    /*有一个int类型的数组[1, 8, 26, 45, 60, 78, 99]，
    现在键盘录入一个0-100之间（范围无需代码判断）的数字，
    将该数字按从小到大顺序插入到该数组（如输入数字50,
    那么这个数组的结果为：[1, 8, 26, 45, 50, 60, 78, 99]）。
    并在控制台中打印修改前和修改后的数组。*/
    public static void main(String[] args) {
        int[] arr={1, 8, 26, 45, 60, 78, 99};//定义新数组
        System.out.println("请输入一个0-100之间的数字");
        Scanner sc=new Scanner(System.in);//键入输入的数字
        int num=sc.nextInt();
        //定义新数组的长度,用来存入插入的数据
        int[] arr2=new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {//遍历原始数组
            arr2[i]=arr[i];//赋值到新数组中
            arr2[arr.length]=num;//将键入的数字添加在新数组最后一位索引位置
        }
        Arrays.sort(arr2);//自动升序数组
        System.out.println(Arrays.toString(arr2));//数组转化成字符串输出
    }
}
