package cn.day05.demo;

public class DemoArrayUses {
    public static void main(String[] args) {
        int[] arr1={12,13,34,23};

        //第一种直接打印使用
        System.out.println(arr1[0]);//12
        System.out.println(arr1[1]);//13

        //定义第二个数组,并赋值第一个数组地址
        int[] arr2=arr1;
        arr2[0]=24;
        arr2[1]=25;
        System.out.println(arr2[0]);//24
        System.out.println(arr2[1]);//25

        //再来尝试输出数组1
        System.out.println(arr1[0]);//24
        System.out.println(arr1[1]);//25
    }
}
