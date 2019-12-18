package cn.day04.practice;
/*
分析以下需求，并用代码实现(每个小需求都需要写一个方法)
		1.定义变量:长方形的长和宽
			定义方法:计算该长方形的周长,并在main方法中打印周长
			定义方法:计算该长方形的面积,并在main方法中打印面积
		3.定义变量:圆的半径
			定义方法:计算该圆的周长,并在main方法中打印周长
			定义方法:计算该圆的面积,并在main方法中打印面积
*/
public class Test2 {
    public static void main(String[] args) {
        int w;
        int h;
        int r;
        System.out.println("长方形的周长="+getZhouChang(6,4));
        System.out.println("长方形的面积="+mianJi(6,4));
        System.out.println("圆的周长="+getGirth(4));
        System.out.println("圆的面积="+getArea(4));
    }

    //定义周长计算方法
    public static int getZhouChang(int w,int h){
        return (w+h)*2;
    }
    //定义面积
    public static int mianJi(int w,int h){
        return w*h;
    }
    //创建圆的周长
    public static double getGirth(int r){
        return 2*3.14*r;
    }
    //创建圆的面积
    public static double getArea (int r){
        return 3.14*r*r;
    }
}
