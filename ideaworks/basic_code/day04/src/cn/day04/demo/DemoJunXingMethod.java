package cn.day04.demo;
//打印一个5行20列的矩形
public class DemoJunXingMethod {
    public static void main(String[] args) {
        method();//调用方法
    }
    public  static void method(){
        for (int i = 0; i < 5; i++) {   //定义外层循环数5行
            for (int j = 0; j < 20; j++) {  //定义内层循环20列
                System.out.print("*");  //切记此处不换行
            }
            System.out.println();//换行
        }
    }
}
