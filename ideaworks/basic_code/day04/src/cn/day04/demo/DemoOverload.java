package cn.day04.demo;

public class DemoOverload {
    public static void main(String[] args) {
        //定义不同数据变量
        byte a = 10;
        byte b = 20;
        short c = 10;
        short d = 20;
        int e = 10;
        int f = 20;
        long g = 10;
        long h = 20;
        //调用
        System.out.println(compare(a,b));
        System.out.println(compare(c,d));
        System.out.println(compare(e,f));
        System.out.println(compare(g,h));

    }

    //两个byte类型
    public static boolean compare(byte a, byte b) {
        System.out.println("byte");
        return a == b;
    }

    //两个short类型
    public static boolean compare(short a, short b) {
        System.out.println("short");
        if(a==b){
          return true;
        }else{
          return false;
        }
    }

    //两个int类型
    public static boolean compare(int a, int b) {
        System.out.println("int");
        boolean same= a==b ? true:false;
        return same;
    }

    //两个long类型
    public static boolean compare(long a, long b) {
        System.out.println("long");
        boolean same;
        if(a==b){
            same=true;
        }else{
            same=false;
        }
        return same;
    }
}
