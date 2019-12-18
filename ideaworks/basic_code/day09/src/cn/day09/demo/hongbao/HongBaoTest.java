package cn.day09.demo.hongbao;

import java.util.ArrayList;

public class HongBaoTest {

    public static void main(String[] args) {
        Manager manager = new Manager("老师", 150);

        Member one = new Member("小明", 0);
        Member two = new Member("小红", 0);
        Member three = new Member("小兰", 0);

        manager.show(); // 150
        one.show(); // 0
        two.show(); // 0
        three.show(); // 0
        System.out.println("===============");

        // 群主总共发50块钱，分成3个红包
        ArrayList<Integer> redList = manager.send(50, 3);
        // 三个普通成员收红包
        if(redList.size()!=0){//首先判断一下集合长度时候小于等于0
            one.receive(redList);
            two.receive(redList);
            three.receive(redList);
        }


        manager.show(); // 150-50=100
        one.show();
        two.show();
        three.show();
    }

}
