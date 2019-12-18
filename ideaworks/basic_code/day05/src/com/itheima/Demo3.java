package com.itheima;

public class Demo3 {
    /*
    (1).定义一个长度为5的int类型的数组，内容为{33,55,11,20,99}
		(2).求出数组中元素的平均值,
		(3).并在控制台打印输出平均值和数组中大于平均值的元素个数。
     */
    public static void main(String[] args) {
        int[] arr = {33,55,11,20,99};
        System.out.println("平均值"+getAvg(arr));
        System.out.println("大于平均值的个数"+getCount(arr));
    }
    /*
    求数组中元素的平均值
    int[] arr
    double
     */
    public static double getAvg(int[] arr) {
        //先求所有元素的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum*1.0 / arr.length;
        return avg;
    }
    /*
    求大于素组中平均值元素的个数
    int[] arr
    int
     */
    public static int getCount(int[] arr) {
        double avg = getAvg(arr);
        //统计大于平均值的个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > avg) {
                count ++;
            }
        }
        return count;
    }
}
