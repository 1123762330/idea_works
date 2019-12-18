package cn.day.practice;

/*
*   在main方法中定义3个变量：int a = 50;  int b = 30;  int c = 80;
	并依次完成以下要求：
	1.定义方法getMax()利用if语句求出a、b、c中最大的数并打印到控制台上；
	2.定义方法getMin()利用三元运算符求出a、b、c中最小的数并打印到控制台上；

* */
public class Test1 {
    public static void main(String[] args) {
        int a = 50;
        int b = 30;
        int c = 80;
        //第一种方法调用
        int Max = getMax(a, b, c);
        System.out.println("最大值:" + Max);
        //第二种方法调用
        int max2=getMax2(a,b,c);
        System.out.println("最大值2:"+max2);
        //第三种方法调用
        int max3=getMax3(a,b,c);
        System.out.println("最大值3:"+max3);
        //最小值方法调用
        int min = getMin(a, b, c);
        System.out.println("最小值:" + min);
    }

    //最大数
    public static int getMax(int a, int b, int c) {
        int temp;
        int max;
        if (a > b) {
            temp = a;
        } else {
            temp = b;
        }
        if (temp > c) {
            max = temp;
        } else {
            max = c;
        }
        return max;
    }

    //最大数求值第二种方法
    public static int getMax2(int a, int b, int c) {
        int max = c > (a > b ? a : c) ? c : (a > b ? a : c);
        return max;
    }

    //最大数求值第三种方法
    public static int  getMax3(int a, int b, int c) {
        if(a>b&&a>c){
            return a;
        }else if(b>a && b>c){
            return b;
        }else{
            return c;
        }
    }

    //定义最小数
    public static int getMin(int a, int b, int c) {
        int temp = (a < b) ? a : b;
        int min = temp < c ? temp : c;
        return min;
    }

}
