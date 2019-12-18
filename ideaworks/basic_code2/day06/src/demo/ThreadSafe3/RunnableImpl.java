package demo.ThreadSafe3;

import java.util.concurrent.locks.ReentrantLock;

/*
    实现卖票案例
 */
public class RunnableImpl implements Runnable {
    private int ticket = 100;//定义一个多个线程共享的票源
    ReentrantLock s = new ReentrantLock();//创建ReentrantLock锁

    @Override
    public void run() {
        while (true) {//使用死循环,让卖票操作重复执行
            sullTicket();//调用同步方法
        }
    }

    public synchronized void sullTicket() {//创建同步方法
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



