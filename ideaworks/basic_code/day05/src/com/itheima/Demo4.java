package com.itheima;

public class Demo4 {
    /*
     定义一个int类型的数组.将数组的最大值和最小值交换位置.
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        change(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    /*
    交换数组中最大值和最小值
    参数列表    int[] arr
    //操作数组中的元素的时候,方法不用返回值.
    返回值类型  void
     */
    public static void change(int[] arr){
        //1.先求最大值和最小值的位置
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
            if(arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
//        System.out.println(arr[maxIndex] +" "+arr[minIndex]);
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp;
    }
}
