package cn.day10.demo.computerinstance;

public class Keyboard implements USB {
    @Override
    public void open() {//重写接口方法
        System.out.println("插上键盘");
    }

    @Override
    public void close() {//重写接口方法
        System.out.println("取下键盘");
    }

    public void type(){//键盘的特有方法
        System.out.println("键盘输入");
    }
}
