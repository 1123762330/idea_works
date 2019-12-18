package demo.maibaozi;

public class Test {
    public static void main(String[] args) {
        //创建包子类对象
        BaoZi bz = new BaoZi();
        //创建包子铺线程,并启动线程
        new BaoZiPu(bz).start();
        //创建顾客线程,并启动线程
        new GuKe(bz).start();
    }
}
