package test6;
/* 成员方法: void  controlTV(TV tv):方法内输出"遥控器控制电视",然后提示用户键盘录
         入一个字符串作为电视节目信息,调用tv的play方法,将节目信息作为参数传入；*/

import java.util.Scanner;

public class RemoteControl {
    public void  controlTV(TV tv){
        System.out.println("遥控器控制电视");
        System.out.println("请输入电视节目:");
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        tv.play(str1);
    }

}
