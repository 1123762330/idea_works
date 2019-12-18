package cn.day02.practice;
/*
定义三个int变量,值大小都不同
	(1)求出三个数中的最小值并打印
	(2)求出三个数的和并打印
	提示:
    先比较两个数的大小赋值给中间变量,然后用中间变量和第三个数比较
*/
public class Test3{
    public static void main(String[] args){
        int a=23;
        int b=16;
        int c=14;
        int temp=a<b?a:b;
        int result=temp<c?temp:c;
        int sum=a+b+c;
        System.out.println("最小值是:"+result+"\r\n"+"三数之和是:"+sum);

    }
}