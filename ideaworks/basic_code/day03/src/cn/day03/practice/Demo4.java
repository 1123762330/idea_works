package cn.day03.demo.practice;

public class Demo4 {
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
    public static void main(String[] args) {
//        method();
        int a = 30;
        int b = 40;
        int c = 12;
        if(c == 0) {
            System.out.println(a+"+"+b+"="+(a + b));
        }else if(c == 1) {
            System.out.println(a+"-"+b+"="+(a - b));
        }else if(c == 2) {
            System.out.println(a+"*"+b+"="+(a * b));
        }else if(c == 3) {
            System.out.println(a+"/"+b+"="+(a / b));
        }else {
            System.out.println("操作不合法");
        }
    }

    private static void method() {
        int a = 30;
        int b = 40;
        int c = 2;
        //去判断c的值.然后让a和b去做对应的操作
        if(c < 0 || c > 3) {
            System.out.println("操作不合法");
        }else {
            if(c == 0) {
                System.out.println(a+"+"+b+"="+(a + b));
            }else if(c == 1) {
                System.out.println(a+"-"+b+"="+(a - b));
            }else if(c == 2) {
                System.out.println(a+"*"+b+"="+(a * b));
            }else {
                System.out.println(a+"/"+b+"="+(a / b));
            }
        }
    }
}
