package test4;

import java.util.Scanner;

//在主方法中调用invokeCalc方法, 使用Lambda表达式完成测试,键盘录入两个数, 分别计算两个数的和,差,积和商.
public class Test4 {
    public static void main(String[] args) {
        System.out.println("请输入第一个数:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数:");
        int num2 = sc.nextInt();

        //lambda省略格式
        System.out.println("a+b="+invokeCalc(num1, num2, (a, b) -> num1 + num2));//和
        System.out.println("a-b="+invokeCalc(num1, num2, (a, b) -> num1 - num2));//差
        System.out.println("a*b="+invokeCalc(num1, num2, (a, b) -> num1 * num2));//积
        System.out.println("a/b="+invokeCalc(num1, num2, (a, b) -> num1 / num2));//商
    }


    /*在测试类中自定义invokeCalc方法, 方法需要三个参数(包含两个int的数字和一个Calculator 接口),
    在此方法内调用calc方法, 传入两个int类型的参数, 并得到结果后返回;*/
    private static double  invokeCalc(int a, int b, Calculator cal) {
        int sum = cal.calc(a, b);//调用方法
        return sum;
    }

}
