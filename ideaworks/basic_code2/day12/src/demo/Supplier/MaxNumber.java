package demo.Supplier;

import java.util.function.Supplier;

public class MaxNumber {
    public static void main(String[] args) {
        //定义一个int类型的数组
        int[] arr = {100, 0, -50, 240, 44, -30};
        int maxValue = getMax(() -> {
            int max = arr[0];//定义一个最大的值
            for (int i : arr) {
                if (i > max) {//进行比较，如果有最大值进行替换
                    max = i;
                }
            }
            return max;
        });
        System.out.println("数组中元素最大值是：" + maxValue);

    }

    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }
}
