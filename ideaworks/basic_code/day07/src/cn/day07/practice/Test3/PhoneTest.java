package cn.day07.practice.Test3;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> list=new ArrayList<>();
        //创建手机对象
        Phone p=new Phone("华为",1200.0,4);
        Phone p1=new Phone("苹果",9000.0,1);
        Phone p2=new Phone("锤子",3000.0,3);
        Phone p3=new Phone("小米",1800.0,2);
        //存储对象
        list.add(p);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Phone phone=list.get(i);
            if(phone.getYear()<=2&&phone.getPrice()<2000){
                System.out.println(phone.getBrand()+"-"+phone.getPrice()+"-"+phone.getYear());
            }
            if (phone.getPrice()>5000){
                Phone shanchu=list.remove(i);
                System.out.println("删除的手机是:"+shanchu.getBrand());
            }

        }

        System.out.println("=========================");
        //重新遍历删除数据后的集合
        for (int i = 0; i < list.size(); i++) {
            Phone ph=list.get(i);
            System.out.println(ph.getBrand()+ph.getPrice()+" "+ph.getYear());
        }
    }
}
