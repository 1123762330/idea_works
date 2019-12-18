package cn.day05.practice;

/*
题目:
		(1).定义一个长度为5的int类型的数组，内容为{33,55,11,20,99}
		(2).求出数组中元素的平均值,
		(3).并在控制台打印输出平均值和数组中大于平均值的元素个数。
*/
public class Test3 {
    public static void main(String[] args) {
        int[] arr = {33, 55, 11, 20, 99};
        int count = 0;//定义个数
        int sum = 0;//定义一个总和

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];//遍历数组并相加
        }

        double avg = sum*1.0 / arr.length;//求出平均数
        System.out.println("平均值" + avg);//输出平均值

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                //System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}
