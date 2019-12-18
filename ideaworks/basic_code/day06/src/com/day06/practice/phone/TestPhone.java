package com.day06.practice.phone;

public class TestPhone {
    public static void main(String[] args) {
        //创建对象,来调用方法
        Phone p=new Phone("小米",998);

        Phone p2=new Phone();
        p2.setBrand("小米");
        p2.setPrice(998);

        System.out.println("正在使用价格为"+p.getPrice()+"元的"+p.getBrand()+"品牌的手机"+p.call()+"...");
        System.out.println("正在使用价格为"+p.getPrice()+"元的"+p.getBrand()+"品牌的手机"+p.sendMessage()+"...");
        System.out.println("正在使用价格为"+p.getPrice()+"元的"+p.getBrand()+"品牌的手机"+p.playGame()+"...");



    }
}
