package demo.threadpool;

//2.创建一个类,实现Runnable接口,重写run方法,设置线程任务
public class WorldThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"----World");
        }
    }
}
