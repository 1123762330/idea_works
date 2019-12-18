package cn.test8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test8 {
/*有一个int类型的数组[1, 8, 26, 45, 60, 78, 99]，
现在键盘录入一个0-100之间（范围无需代码判断）的数字，
将该数字按从小到大顺序插入到该数组（如输入数字50,
那么这个数组的结果为：[1, 8, 26, 45, 50, 60, 78, 99]）。
并在控制台中打印修改前和修改后的数组。*/
public static void main(String[] args) {
    int[] arr={1, 8, 26, 45, 60, 78, 99};//定义一个int数组
    int[] arr2=new int[arr.length+1];//定义新数组的长度
    System.out.println("请输入一个0-100之间的数字");

    ArrayList<Integer> array=new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
        array.add(arr[i]);
    }
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    array.add(num);

    for (int i = 0; i < array.size(); i++) {
        arr2[i]=array.get(i);
    }
    Arrays.sort(arr2);
    System.out.println(Arrays.toString(arr2));
}
}
