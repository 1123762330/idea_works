package cn.day04.practice;
/*
分析以下需求，并用代码实现(每个小需求都需要写一个成方法)
		1.求两个数据之和(两个整数 )
		2.判断两个数据是否相等(两个整数)
		3.找出两个数中较大的值(两个整数)
		4.找出两个数中较小的值(两个整数)

		思考 :
			1,方法的返回值类型
			2,方法的参数
			3,方法的名字

 */

public class Test1 {
    public static void main(String[] args) {
        sum(3,4);
        System.out.println(sum(3,4));
        System.out.println(same(5,5));
        System.out.println(max(19,9));
        System.out.println(min(23,12));

    }
    //定义求和方法
    public static int sum(int a,int b){
        return a+b;
    }

    //定义比较方法
    public static boolean same(int a,int b){
        boolean sames= a==b ? true:false;
        return sames;
    }
    //定义最大值方法
    public static int  max(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    //定义最小值方法
    public static int min(int a,int b){
        int minnumber= a<b ? a:b;
        return minnumber;
    }
}
