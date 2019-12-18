package demo.duoxiancheng;

public class ThreadDemo {
    public static void main(String[] args) {
        //创建Thread子类对象
        MyThread myThread = new MyThread();
        //调用方法,启动另一个线程
        myThread.start();

        //main主方法的线程
        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
        }
    }
}
