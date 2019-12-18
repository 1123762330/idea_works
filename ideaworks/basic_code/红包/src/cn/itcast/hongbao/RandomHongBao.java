package cn.itcast.hongbao;

import cn.itcast.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomHongBao implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        Random ran = new Random();//定义随机数
        int surplusMoney = totalMoney;//定义剩下的金额
        int surplusCount = totalCount;//定义剩下的红包个数
        for (int i = 0; i < totalCount - 1; i++) {//将金额随机放进总红包-1个里面,留一个装有余数的金额
            int money = ran.nextInt(surplusMoney / surplusCount * 2) + 1;//随机金额的设定
            list.add(money); // 将一个随机红包放入集合
            surplusMoney -= money; // 剩下的金额越发越少
            surplusCount--; // 剩下还应该再发的红包个数，递减
        }

        list.add(surplusMoney);
        return list;
    }
}
