package com.itheima;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {171,72,19,16,118,51,210,7,18};
        //求和的元素的个位和十位不能包含7,并且只能为偶数。
        //定义求和变量
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] % 10 != 7 && arr[i] / 10 % 10 != 7 && arr[i] % 2 == 0){
            //优化判断条件
            if(arr[i] % 2 == 0 && arr[i] / 10 % 10 != 7){
//                System.out.println(arr[i]);
                sum += arr[i];
            }
        }
        System.out.println("和"+sum);
    }
}
