package practice.test8;

public class Test8 {
    public static void main(String[] args) {
        new MyThread("main:").start();
        new MyThread("线程2").start();
    }
}

class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(getName()+"正在执行");
        }
    }
}