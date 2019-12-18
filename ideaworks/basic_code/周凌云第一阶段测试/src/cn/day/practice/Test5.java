package cn.day.practice;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        /*2. 在主方法中定义两个数组并赋值,调用union方法传入这两个数组完成数组合并, 将新数组的内容打印到控制台上
        举例:
        数组1中元素:{78, 48, 94, 34}
        数组2中元素:{20, 32, 10, 98, 69, 52}
        合并后数组：{78, 48, 94, 34, 20, 32, 10, 98, 69, 52}
        */

        int[] array1 = {78, 48, 94, 34};
        int[] array2 = {20, 32, 10, 98, 69, 52};

        int[] arrays = union(array1, array2);

        //第一种输出方法
        System.out.print("第一种输出方法:");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]);
        }

        System.out.println();//换行

        //第二种输出方法
        System.out.print("第二种输出方法" + Arrays.toString(arrays));

    }

    //    1.	定义一个方法union()，传入两个数组，方法的功能是将两个数组的元素合并到一个新数组中, 并返回这个新数组
//    public static int[] union(int[] arr1, int[] arr2){
//        功能: 将两个数组的元素存入到一个新数组中并返回
//    }
    public static int[] union(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];//定义第三个数组用来接收两个数组的数据,长度即为两数组长度相加
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];//遍历数组1并存放在数组3里
        }
        for (int j = 0; j < array2.length; j++) {
            array3[array1.length + j] = array2[j];//遍历数组2也放在数组3里
        }
        return array3;
    }

}
