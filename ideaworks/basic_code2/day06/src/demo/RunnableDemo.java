package demo;

public class RunnableDemo {
    public static void main(String[] args) {
        //创建Runnable接口的实现类
        RunnableImpl runnable = new RunnableImpl();
        //创建Thread类对象,传递进来实现类对象
        Thread thread = new Thread(runnable);
        //Thread类对象启动线程
        thread.start();
    }
}

        //自定义一个类,实现Runnable接口
class RunnableImpl implements Runnable {
        //重写run方法
        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() + "----" + i);
            }
        }
}
