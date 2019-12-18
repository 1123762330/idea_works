package practice.test6;

public class Test6 {
    public static void main(String[] args) {
       new MyTherad("主线程").start();
       new MyTherad("子线").start();

    }
}

class MyTherad extends Thread{
    public MyTherad() {
    }

    public MyTherad(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"在运行");
        }
    }
}
