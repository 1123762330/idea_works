package cn.itcast.hongbao;

import cn.itcast.red.OpenMode;

import java.util.ArrayList;

public class AvgHongBao implements OpenMode {
    @Override                       //这里需要定义成final类型,总金额是不变的,红包总个数是不变的
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();//创建一个集合,用来存放红包
        int avg = totalMoney / totalCount; // 红包平分
        int mod = totalMoney % totalCount; // 有零头
        //将红包平均分
        for (int i = 0; i < totalCount - 1; i++) {//红包小于红包总个数减一个
            list.add(avg);//添加到集合里
        }

        list.add(avg + mod);//有余数存储在最后一个红包里
        return list;
    }
}
