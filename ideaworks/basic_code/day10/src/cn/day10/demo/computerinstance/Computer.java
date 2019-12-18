package cn.day10.demo.computerinstance;

public class Computer  {
    public void open(){
        System.out.println("电脑开机");
    }
    public void close(){
        System.out.println("电脑关机");
    }

    public void useDevice(USB usb){//使用USB功能
        usb.open();//打开usb
        if(usb instanceof Mouse){//如果usb接口是鼠标
            Mouse mouse=(Mouse) usb;//向下转型,将usb接口转成鼠标接口
            mouse.click();//获取鼠标的特有功能
        }else if (usb instanceof Keyboard){
            Keyboard keyboard=(Keyboard) usb;//向下转型,将usb接口转换成键盘
            keyboard.type();//获取键盘的独有功能
        }
        usb.close();//关闭usb
    }
}
