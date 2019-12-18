package cn.day05.practice;

//定义一个int类型的数组.将数组的最大值和最小值交换位置.
public class Test4 {
    public static void main(String[] args) {
        int[] array = {12, 1, 4, 18};
        int maxIndex = 0;//定义最大值下标
        int minIndex = 0;//定义最小值下标
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxIndex) {
                maxIndex = i;
            }
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minIndex) {
                minIndex = i;
            }
        }

        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
