package cn.day.practice;
//三元运算符直接求最大值
public class SanYuanYunSuanMaxDemo {
    public static void main(String[] args) {
        int a=90;
        int b=50;
        int c=80;
        int max=(c>(a>b?a:b)?c:(a>b?a:b));
        System.out.println(max);
    }
}
