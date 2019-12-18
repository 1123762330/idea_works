package cn.test2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/* 定义 getNewArr()静态方法:要求传入一个int类型的数组arr,遍历数组，键盘录入一个数字,
          将数组中小于20的元素替换成键盘录入的数字，然后返回修改之后的数组
        在main方法中完成:
        1. 定义一个长度为5的int类型的数组
        2. 随机生成5个随机数存入数组(随机数的范围为5到50,包括5和50)，并把数
                组中的元素打印在控制台
        3. 调用getNewArr方法,在控制台打印返回后的数组中的元素*/
public class Test2 {
    public static void main(String[] args) {
        int[] list = new int[5];//创建数组,并制定长度为5
        //生成5个随机数
        Random ran = new Random();
        System.out.println("随机生成的5个数字是:");
        for (int i = 0; i < 5; i++) {
            int r = ran.nextInt(46) + 5;//定义数组的取值范围
            System.out.print(r + " ");
            list[i] = r;//将随机数赋值给list数组
        }

        int[] arr2 = getNewArr(list);//定义一个数组2来调用方法,并遍历输出
        System.out.println("\r\n"+"修改后的数组中元素为:");
        System.out.print(Arrays.toString(arr2));//直接调用toString方法

       /* //遍历数组并输出结果
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }*/
    }


    public static int[] getNewArr(int[] arr) {
        System.out.println();
        System.out.println("键盘录入一个数字:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 20) {
                arr[i] = num;
            }
        }
        return arr;//返回数组
    }
}
