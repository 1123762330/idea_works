package com.itheima;

public class Demo3_2 {
    public static void main(String[] args) {
        int[] arr = {33,55,11,20,99};
        double[] method = method(arr);
        System.out.println("平均值"+method[0]);
        System.out.println("大于平均值的个数"+method[1]);
    }
    /*
    定义一个方法.求数组的平均值,和大于平均值元素的个数
    参数列表 int[] arr
    double[]
     */
    public static double[] method(int[] arr){
        //1.先求平均值
        //定义一个求和变量.
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum * 1.0 / arr.length;
        //求大于平均值元素的个位数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > avg) {
                count ++;
            }
        }
        double[] arr1 = {avg,count};
        return arr1;
    }
}
