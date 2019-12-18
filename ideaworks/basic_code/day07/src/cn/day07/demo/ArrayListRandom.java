package cn.day07.demo;

import java.util.ArrayList;
import java.util.Random;

//随机产生5个1~30的数到集合中,并且遍历输出

public class ArrayListRandom {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Integer> list=new ArrayList<>();
        //创建random对象
        Random ran=new Random();

        //添加随机数组到集合中
        for (int i = 0; i < 5; i++) {
            int r=ran.nextInt(30)+1;
            list.add(r);
        }

        //遍历集合输出
        for (int i = 0; i <list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

    }
}
