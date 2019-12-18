package cn.day05.demo;
//数组的使用方式
public class DemoArrayUse {
    public static void main(String[] args) {
        int[] arr={12,13,34,23};

        //第一种直接打印使用
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

        //第二种,赋值使用
        int num=arr[0];
        System.out.println("第一个值" + num);

    }
}
