package demo.ThreadSafe;

/*
    实现卖票案例
 */
public class RunnableImpl implements Runnable {
    private int ticket = 100;//定义一个多个线程共享的票源
    Object lock = new Object();//创建同步代码块

    @Override
    public void run() {
        while (true) {//使用死循环,让卖票操作重复执行
            synchronized (lock) {//同步代码块
                if (ticket > 0) {//先判断票是否存在
                    try {//提高安全问题出现的概率,让程序睡眠
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                    ticket--;
                }
            }

        }
    }
}



