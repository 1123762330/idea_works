package cn.day09.demo.override;

public class OverrideDemo {
    public static void main(String[] args) {
        NewPhone zhinengjiZ = new NewPhone();
        //调用父类继承而来的方法
        zhinengjiZ.call();

        //调用子类重写的方法
        zhinengjiZ.showNum();
    }

}
