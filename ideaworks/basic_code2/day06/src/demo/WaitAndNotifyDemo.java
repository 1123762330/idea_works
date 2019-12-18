package demo;

public class WaitAndNotifyDemo {
    public static void main(String[] args) {
        Object obj = new Object();//创建同步代码块

        //顾客线程
        new Thread() {
            public void run() {

                while (true) {//一直买包子
                    synchronized (obj) {//调用同步代码块
                        System.out.println("顾客1说:老板,我要买包子");
                        try {
                            obj.wait();//进入无限等待状态
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后
                        System.out.println("顾客1说:操,老子不吃了");
                    }
                }
            }
        }.start();

        //顾客2线程
        new Thread() {
            public void run() {

                while (true) {//一直买包子
                    synchronized (obj) {//调用同步代码块
                        System.out.println("顾客2说:老板,我也要买包子");
                        try {
                            obj.wait();//进入无限等待状态
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后
                        System.out.println("顾客2说:我等了这么久,我好饿啊!");
                    }
                }
            }
        }.start();

        //老板线程
        new Thread() {
            public void run() {

                while (true) {//一直循环做包子
                    //首先花费5秒钟做包子,等待5秒
                    try {
                        Thread.sleep(5000);//花费5秒时间做包子
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (obj) {//调用同步代码块
                        System.out.println(/*"5秒钟之后,老板说:包子做好了,快起来吃包子"*/"老板说:吃你妈卖批,不卖了");
                        obj.notifyAll();//调用唤醒方法
                    }

                }
            }
        }.start();
    }
}
