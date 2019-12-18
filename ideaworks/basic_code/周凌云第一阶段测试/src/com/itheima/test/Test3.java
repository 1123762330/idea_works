package com.itheima.test;

/*
定义五个方法分别求数组的最大值 ,最小值, 总和, 平均值与奇数的个数,
在主方法中定义数组{23,55,32,18,67,75,97,12,78,89}, 调用每个方法完成测试

 */
public class Test3 {
    public static void main(String[] args) {
        int[] arr1 = {23, 55, 32, 18, 67, 75, 97, 12, 78, 89};
        System.out.println("最大值:" + getMax(arr1));
        System.out.println("最小值:" + getMin(arr1));
        System.out.println("总和:" + getSum(arr1));
        System.out.println("平均数:" + getAvg(arr1));
        int[] jishu=jishu(arr1);//调用数组
        //遍历数组并打印
        System.out.print("奇数分别是:");
        for (int i = 0; i < jishu.length; i++) {
            System.out.print(jishu[i]+" ");
        }
    }

    //定义最大值
    public static int getMax(int[] arr1) {
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        return max;
    }

    //定义最小值
    public static int getMin(int[] arr1) {
        int min = 0;
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] < arr1[min]) {
                min = i;
            }
        }
        return arr1[min];
    }

    //定义求和
    public static int getSum(int[] arr1) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        return sum;
    }

    //定义平均值
    public static double getAvg(int[] arr1) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        double avg = sum / arr1.length;
        return avg;
    }

    //定义奇数方法
    public static int[] jishu(int[] arr1) {
        int count=0;//定义奇数的次数
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 1) {//如果%2余数为1就是奇数
                count++;//次数加1
            }
        }

        //把具体数据列举出来,放在一个数组中返回调用
        int[] arr=new int[count];//新建一个数组用来存放具体奇数
        int index=0;//定义数组的索引
        for (int i = 0; i <arr1.length ; i++) {
            if (arr1[i] % 2 == 1) {
                arr[index] = arr1[i];//
                index++;//索引自增
            }
        }
        return arr;//返回数组
    }
}
