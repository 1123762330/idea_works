package practice;

//请在指定位置插入代码实现打印输出1-99。
public class Test6 {
    public int start = 1;
    public int end = 99;

    public static void main(String[] args) {
        new Test6().method();
    }

    public void method() {
        //请在此处插入代码，实现功能
        Runnable a = new Runnable() {
            @Override
            public void run() {
                while (start <= end) {
                    System.out.println(start);
                    start++;
                }
            }
        };

        Thread t = new Thread(a);
        t.start();
    }
}
