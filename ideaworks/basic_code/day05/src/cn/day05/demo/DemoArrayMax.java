package cn.day05.demo;

public class DemoArrayMax {
    public static void main(String[] args) {
        int[] arr={10,32,435,31,3445};//数组数据
        int max=arr[0];//比武擂台(定义最大值)
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];//交换最大值
            }
        }
        System.out.println("最大值是"+max);


        int[] arr2={12,14,3566,75,1313};
        int maxIndex=0;//假设最大数据的索引值为0(定义最值索引)
        for (int i = 1; i <arr2.length; i++) {
            if(arr2[i]>arr2[maxIndex]){
                maxIndex=i;//交换较大数字的索引值
            }
        }
        System.out.println(arr2[maxIndex]);
    }
}
