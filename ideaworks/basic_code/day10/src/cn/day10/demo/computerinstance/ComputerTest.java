package cn.day10.demo.computerinstance;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new Computer();//创建电脑
        computer.open();//打开电脑

        //鼠标的功能方法
        USB usbMouse = new Mouse();//向上转型
        computer.useDevice(usbMouse);//电脑调用usb接口方法

        //键盘的功能方法
        //第一种传递实现类对象
        Keyboard usbKeyboard = new Keyboard();//向上转型
        computer.useDevice(usbKeyboard);//电脑调用usb接口方法
        //第二种,多态写法
        /*USB usbKeyboard1=new Keyboard();
        computer.useDevice(usbKeyboard1);*/

        computer.close();
    }
}
