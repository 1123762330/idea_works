package demo;

public class LambdaDemo {
    public static void main(String[] args) {
       /* //使用匿名内部类方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "---HelloWorld");
                }
            }
        }).start();*/

        //使用Lambda表达式
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("HelloWorld");
            }
        }).start();
    }
}
