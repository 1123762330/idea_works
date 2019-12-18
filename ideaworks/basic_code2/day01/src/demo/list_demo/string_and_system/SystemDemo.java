package demo.list_demo.string_and_system;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        demo1();//获取程序运行用了多少毫秒
        demo2();//数组复制
    }

    private static void demo2() {
        //定义源数组
        int[] src = {1, 2, 3, 4, 5};
        //定义目标数组
        int[] dest = {6, 7, 8, 9, 10};
        System.out.println("复制前:" + Arrays.toString(dest));
        //使用System类中的arraycopy把源数组的前3个元素复制到目标数组的前3个位置上
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println("复制后:" + Arrays.toString(dest));
    }

    private static void demo1() {
        long s = System.currentTimeMillis();//获取开始毫秒值
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long s2 = System.currentTimeMillis();//获取结束毫秒值
        System.out.println("共耗时:" + (s2 - s) + "毫秒");
    }
}
