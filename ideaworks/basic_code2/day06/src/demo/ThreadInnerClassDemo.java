package demo;

public class ThreadInnerClassDemo {
    public static void main(String[] args) {
        //Thread匿名内部类
        new Thread("旺财"){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(getName()+":Hello:"+i);
                }
            }
        }.start();

        //Runnable接口匿名内部类
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+":World:"+i);
                }
            }
        },"来福").start();
    }
}
