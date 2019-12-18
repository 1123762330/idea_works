package practice2.test1;

//定义一个实体店线程类
public class FrontShop implements Runnable {
    private Fruit f;

    public FrontShop() {
    }

    public FrontShop(Fruit f) {
        this.f = f;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (f) {//同步锁
                if (f.flag == false) {//如果标记是正确的,那么程序进入等待
                    try {
                        f.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                f.stock++;

                //程序唤醒就执行下面的程序
                if (f.stock > 0 && f.stock <= 100) {
                    System.out.println("实体店正在卖出第" + f.stock + "份，还剩余" + (100 - f.stock) + "份");
                    //修改标记,唤醒另一个进程
                    f.flag = false;
                    f.notify();
                    System.out.println("===========");
                }

            }
        }
    }

}
