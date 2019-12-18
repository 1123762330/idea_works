package practice.test10;

/*一共有1000张电影票,可以在两个窗口领取,假设每次领取的时间为3000毫秒,
要求:请用多线程模拟卖票过程并打印剩余电影票的数量*/
public class Test10 {
    public static void main(String[] args) {
        TicketThread run = new TicketThread();
        new Thread(run, "窗口1").start();
        new Thread(run, "窗口2").start();
    }
}

class TicketThread implements Runnable {
    private int ticket = 1000;//定义1000张票
    String s = new String();//创建ReentrantLock锁

    @Override
    public void run() {
        while (true) {//使用死循环,让卖票操作重复执行
            synchronized (s) {
                if (ticket > 0) {//先判断票是否存在
                    try {//提高安全问题出现的概率,让程序睡眠
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + (1000-ticket) + "张票"+",剩余"+ticket+"张票");
                    ticket--;
                }
            }
        }
    }
}


