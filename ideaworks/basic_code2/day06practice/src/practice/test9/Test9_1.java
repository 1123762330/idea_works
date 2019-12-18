package practice.test9;

public class Test9_1 {
    public static void main(String[] args) {
        //创建MyThread实现类
        MyThread mt = new MyThread();
        for (int i = 0; i < 10; i++) {
            new Thread(mt,"人"+(i+1)).start();
        }

    }
}
class MyThread implements Runnable{
    //定义次数
    int count=0;
    @Override
    public void run() {
        synchronized (this) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在通过,总共" + (++count) + "个人通过山洞");
        }
    }
}