package practice.test11;

public class Test11 {
    public static void main(String[] args) {
        Mythread3 mythread3 = new Mythread3();
        Mythread1 mythread1 = new Mythread1();
        Mythread2 mythread2 = new Mythread2();
        mythread1.start();
        mythread2.start();
        mythread3.start();
    }
}

class Mythread1 extends Thread{
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Integer a=i;
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("线程1的时间:"+time);
    }
}

class Mythread2 extends Thread {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            String b="黑马程序员";
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("线程2的时间:"+time);
    }
}

class Mythread3 extends Thread{

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            String c="黑马程序员"+i;
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("线程3的时间:"+time);
    }
}
