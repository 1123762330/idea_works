package cn.day10.demo.mutilmethod;

public class Zi extends Fu {
    int num=20;

    @Override
    public void showNum() {
        System.out.println(num);//子类的num
    }

    @Override
    public void method(){
        System.out.println("这是子类方法");
    }

}
