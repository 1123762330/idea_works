package demo.maibaozi;

public class GuKe extends Thread {
    //1.需要在成员位置创建一个包子变量
    private BaoZi bz;

    //2.使用带参数构造方法,为这个包子变量赋值
    public GuKe(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz){
                //首先判断有没有包子
                if (bz.flag == false) {
                    try {
                        bz.wait();//如果没有包子就等待,让老板做包子
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //喊醒顾客起来吃包子
                System.out.println("顾客说:终于做好了,开吃");

                //顾客吃完包子后,修改包子的状态为没有
                bz.flag = false;

                //喊老板做包子
                bz.notify();//唤醒老板线程

                System.out.println("顾客说;我已经吃完了,来份别的口味的包子");
                System.out.println("===============");
            }
        }
    }
}
