package com.itheima.test;

/*
定义一个replace方法用于遍历数组，将数组中小于10的元素替换成100，然后打印修改后的数组中的元素;
在main方法中定义一个int型数组{5,35,6,20,2,68,75,8,10,9}，调用replace方法完成测试.

*/
public class Test2 {
    public static void main(String[] args) {
        int[] array = {5,35,6,20,2,68,75,8,10,9};
        replace(array);

    }
    public static void replace(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i]<10){
                array[i]=100;
            }
            System.out.println(array[i]);
        }

    }
}
