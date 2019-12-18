package cn.day03.demo.practice;
/*
1.功能描述：模拟计算器功能，对数据进行加、减、乘、除的运算，并打印运算结果
	2.要求：
	    (1)定义三个整数,其中前两个整数代表参加运算的数据，
	        第三个整数为要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算)
	    (2)演示格式如下:
	        第一个整数:30
	        第二个整数:40
	        第三个整数:0 (0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算)
	        控制台输出:30+40=70
 */
public class Test4 {
    public static void main(String[] args){
        int a=30;
        int b=40;
        int c=0;
        switch (c){
            case 0:
               int  jia=a+b;
               System.out.println(a+"+"+b+"="+jia);
               break;
            case 1:
                int  jian=a-b;
                System.out.println(a+"-"+b+"="+jian);
                break;
            case 2:
                int  cheng=a*b;
                System.out.println(a+"*"+b+"="+cheng);
                break;
            case 3:
                int  chu=a/b;
                System.out.println(a+"/"+b+"="+chu);
                break;
            default:
                    System.out.println("输入的数据有误");
                break;
        }
    }
}
