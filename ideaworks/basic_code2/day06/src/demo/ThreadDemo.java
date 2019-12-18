package demo;

public class ThreadDemo {
    public static void main(String[] args) {
        new MyThread("旺财").start();
        new MyThread("小强").start();
        new MyThread("来福").start();
    }
}


class MyThread extends Thread{
    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String str="----"+"HelloWorld"+"----"+i;
            System.out.println(getName()+str);
        }
    }
}
