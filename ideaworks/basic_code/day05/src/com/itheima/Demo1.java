package com.itheima;

public class Demo1 {
    /*
    第01题
完成课堂案例代码
	1、课堂练习代码。找出数组的最大值
	2、课堂练习代码。找出数组的最小值
	3、课堂练习代码。将数组内容反转之后打印出来
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //假设索引0的元素是做大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            //比较的是元素
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值"+max);
        int max1 = getMax(arr);
        System.out.println("max1 = " + max1);
    }
    /*
    定义一个方法,求数组的最大值
    参数列表  int[] arr
    返回最大值,返回值类型 int
     */
    public static int getMax(int[] arr) {
        //假设最大值的位置是0
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            //比较的是元素
            if(arr[i] > arr[maxIndex]) {
                //交换的是索引
                maxIndex = i;
            }
        }
        return arr[maxIndex];
}
}
