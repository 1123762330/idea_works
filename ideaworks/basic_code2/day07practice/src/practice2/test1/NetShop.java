package practice2.test1;

//定义一个官网线程类
public class NetShop implements Runnable {
    private Fruit f;//创建水果变量

    public NetShop() {//无参构造
    }

    public NetShop(Fruit f) {//有参构造
        this.f = f;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (f) {//同步锁
                if (f.flag == true) {//如果标记是false,那就进入等待状态
                    try {
                        f.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                f.stock++;

                //如果标记正确,那就执行程序
                if (f.stock > 0 && f.stock <= 100) {
                    System.out.println("官网正在卖出第" + f.stock + "份，还剩余" + (100 - f.stock) + "份");
                    //修改标记,唤醒另一个进程
                    f.flag = true;
                    f.notify();
                }

            }

        }

    }
}
