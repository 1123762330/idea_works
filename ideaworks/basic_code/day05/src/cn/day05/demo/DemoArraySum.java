package cn.day05.demo;
//一维数组求和
public class DemoArraySum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(getSum(arr));

    }

    //定义求和方法
    public static int getSum(int[]arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
