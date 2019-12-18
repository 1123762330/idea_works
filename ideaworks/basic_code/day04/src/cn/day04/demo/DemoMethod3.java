package cn.day04.demo;

public class DemoMethod3 {

    public static void main(String[] args) {
        sum();//第一种
        System.out.println(sum1(10,30));//第二种
        System.out.println(sum2(10,12));//第三种
        sum3(20,30);//第四种

    }

    public  static void sum3(int a,int b){
        int result=a+b;
        System.out.println(result);
    }

    public static int sum2(int a,int b) {
        int result=a+b;
        return result;
    }
    public static int sum1(int a,int b) {
        return a+b;
    }

    public static void   sum() {
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println("sum = " + sum);
    }
}
