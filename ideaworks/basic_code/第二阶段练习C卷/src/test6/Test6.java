package test6;
/** 创建TV对象；
* 创建RemoteControl对象,调用其controlTV的方法；
* 创建Phone对象,调用其connecting方法和controlTV方法；*/

public class Test6 {
    public static void main(String[] args) {
        TV tv = new TV("海尔");
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.controlTV(tv);
        Phone phone = new Phone();
        phone.connecting();
        phone.controlTV(tv);
    }
}
