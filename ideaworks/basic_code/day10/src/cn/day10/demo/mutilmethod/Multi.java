package cn.day10.demo.mutilmethod;

public class Multi {
    public static void main(String[] args) {
        //使用多态
        Fu obj=new Zi();
        obj.method();
        obj.fuMethod();
        obj.showNum();//子类的20 ,如果子类没有就去寻找父类中方法

    }
}
