package cn.day10.demo.mutilmethod;

public class Fu {
    int num = 10;

    public void showNum() {
        System.out.println(num);//父类的num
    }
    public void method(){
        System.out.println("这是父类方法");
    }
    public void fuMethod(){
        System.out.println("父亲特有的方法");
    }
}
