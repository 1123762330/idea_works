package com.day06.practice.demo2;

public class TestPhone {
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.setBrand("苹果");
        ph.setPrice(9999);
        ph.call();
        ph.sendMessage();
        ph.playGame();

    }
}
