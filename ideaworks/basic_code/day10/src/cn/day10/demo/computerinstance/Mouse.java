package cn.day10.demo.computerinstance;

public class Mouse implements USB {

    @Override
    public void open() {//重写接口方法
        System.out.println("插上鼠标");
    }

    @Override
    public void close() {//重写接口方法
        System.out.println("拔下鼠标");
    }
    public void click(){//鼠标的特有方法
        System.out.println("点击鼠标");
    }
}
