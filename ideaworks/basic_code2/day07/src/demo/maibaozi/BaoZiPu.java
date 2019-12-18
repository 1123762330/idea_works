package demo.maibaozi;

public class BaoZiPu extends Thread {
    //定义一个包子的成员变量,用来调用方法
    private  BaoZi bz;

    //2.使用带参数构造方法,为这个包子变量赋值
    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        //首先判断有没有包子
        while (true){
            synchronized (bz) {
                if (bz.flag == true) {//如果有包子,那线程二等待
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //如果没有包子那就要做包子
                System.out.println("包子铺正在做包子");//需要等3秒来做包子
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //生产点不同的口味
                if(count%2==0){
                    //生产 薄皮三鲜馅包子
                    bz.pi = "薄皮";
                    bz.xian = "三鲜馅";
                }else{
                    //生产 冰皮 牛肉大葱陷
                    bz.pi = "冰皮";
                    bz.xian = "牛肉大葱陷";

                }
                count++;

                //包子铺生产好了包子,修改包子的状态为true有
                bz.flag = true;
                //唤醒吃货线程,让吃货线程吃包子
                bz.notify();
                System.out.println("老板说:包子已经做好了,"+bz.pi+bz.xian+"包子,嘿,醒醒");
            }
        }
    }
}
