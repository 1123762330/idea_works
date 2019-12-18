package cn.day04.demo;

public class DemoMethod {
    public static void main(String[] args) {
        int sum=getSum();//获取方法
        System.out.println(sum);
    }
    //定义一个方法
    public static int getSum() {
        int sum=0;//定义一个变量用来存放总和
        for(int i=1;i<=100;i++){
            sum+=i;//sum=sum+i,求和公式
        }
        return sum;
    }
}
