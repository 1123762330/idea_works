package cn.day05.demo;
public class DemoArrayReturn{
    public static void main(String[] args) {
        int[] result=getArray(10,20,30);//调用数组方法

        int[] arr={1,2,3,4};
        int[] arrs=getmethod(arr);
        System.out.println("总和"+result[0]);
        System.out.println("平均数"+result[1]);
        System.out.println(arrs);
    }

    public static int[] getmethod(int[] arr){
        return arr;
    }

    public static int[] getArray(int a,int b,int c){
        int sum=a+b+c;
        int avg=sum/3;
        //定义一个塑料袋,用来装这两个结果
        int[] arr={sum,avg};
         return arr;

    }
}