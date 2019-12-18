package cn.day04.practice;

/*
比较两个数据是否相等。
		参数类型分别为两个 byte 类型，两个 short 类型，两个 int 类型，两个 long 类型，
		并在 main 方法中进行测试。

		思考 :
			1,方法的返回值类型
			2,方法的参数
			3,方法的名字（方法重载）
*/
public class Test3 {
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
        System.out.println(compare(a, b));
        System.out.println(compare(c, d));
        System.out.println(compare(e, f));
        System.out.println(compare(g, h));

    }

    //两个byte类型
    public static boolean compare(byte a, byte b) {
        System.out.println("byte");
        return a == b;
    }

    //两个short类型
    public static boolean compare(short a, short b) {
        System.out.println("short");
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    //两个int类型
    public static boolean compare(int a, int b) {
        System.out.println("int");
        boolean same = a == b ? true : false;
        return same;
    }

    //两个long类型
    public static boolean compare(long a, long b) {
        System.out.println("long");
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }
}
