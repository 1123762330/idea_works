package cn.test3;
/*按要求在main方法中完成以下功能：
        1)定义一个长度为5的int型数组arr，数组元素为1-99（包含1和99）之间的随机数
        2) 提示用户输入2-5之间的一个数字n（n包括2和5,不需要代码判断）
        3)遍历数组arr,筛选出数组中元素是n的倍数的元素并输出*/

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Random ran=new Random();
        for (int i = 0; i < 5; i++) {
            int r=ran.nextInt(99)+1;
            arr[i]=r;//将生成的随机数添加到数组中
        }

        System.out.println("随机生成的数组中元素为:");
        System.out.println(Arrays.toString(arr));

        System.out.println("请输入2-5之间的一个数字:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        //遍历数组
        System.out.println("符合条件的元素为:");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % number==0){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
