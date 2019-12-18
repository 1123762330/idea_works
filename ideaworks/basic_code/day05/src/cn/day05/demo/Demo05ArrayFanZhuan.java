package cn.day05.demo;

//数组反转案例
public class Demo05ArrayFanZhuan {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};//定义一个数组并存放数据
        //数据对调方法
        for (int min = 0, max = arr.length - 1; min <= max; min++, max--) {
            int temp = arr[min];//定义一个变量用来接收最小的min值
            arr[min] = arr[max];//数据反转,把最大值赋值给最小值
            arr[max] = temp;//再接着把最小值赋值给最大值
        }
        //遍历数组,进行输出打印
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
