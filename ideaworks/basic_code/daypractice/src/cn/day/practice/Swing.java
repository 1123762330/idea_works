package cn.day.practice;

import javax.swing.*;
import java.awt.*;
public class Swing {
    public static void main(String[] args){
        JFrame  f= new  JFrame("登陆");//名称
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel rq=new JPanel(new GridLayout(3,2));//新建容器一
        JLabel x=new JLabel("姓名",JLabel.CENTER );//标签
        JTextField w1=new JTextField();//输入框
        JLabel m=new JLabel("密码",JLabel.CENTER );//标签
        JTextField w2=new JTextField();//输入框2
        JButton b1=new JButton("确定");
        JButton b2=new JButton("取消");
        Container  cp=f.getContentPane();//新建最外层的内容面板
        rq.add(x);
        rq.add(w1);
        rq.add(m);
        rq.add(w2);
        rq.add(b1);
        rq.add(b2);
        cp.add(rq);//把容器一放在内容面板上
        f.pack();  //将按钮包裹在f中
        f.setVisible(true);//显示框架
    }
}









