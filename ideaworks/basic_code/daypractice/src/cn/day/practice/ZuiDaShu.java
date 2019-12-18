package cn.day.practice;

public class ZuiDaShu {
    public static void main(String[] args) {
        int[] array = {12,1,2,45,30,50};
        int maxIndex = 0;//定义最大索引为该数组的第一个数
        int min = array[0];//定义最小值为该数组的第一个数
        //遍历循环数组
        for (int i = 0; i < array.length; i++) {
            if(array[maxIndex] < array[i]){
                maxIndex = i;
            }
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println("这个数组的最大值为："+array[maxIndex]+"\r\n"+"最小值为："+min);
    }
}