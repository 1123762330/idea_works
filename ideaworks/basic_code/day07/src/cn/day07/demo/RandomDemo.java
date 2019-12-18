package cn.day07.demo;

import java.util.Random;

//获取5-20的随机值
public class RandomDemo {
    public static void main(String[] args) {
        Random ran = new Random();
        for (int i = 0; i < 100; i++) {
            int s = ran.nextInt(16)+5;
            System.out.print(s+" ");
        }

    }
}
