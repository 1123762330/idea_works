package cn.day07.demo;

import java.util.ArrayList;

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();//创建集合对象

        //添加数据
        boolean a=list.add("周凌云");//判断数据是否添加成功
        list.add("赵丽颖");
        list.add("李玉刚");
        System.out.println("集合中数据有:"+list);

        //获取数据
        String s1=list.get(0);
        System.out.println("获取的数据是:"+s1);

        //删除数据
         list.remove(1);
        System.out.println("删除后的集合内容是:"+list);

         //获取长度
        int c=list.size();
        System.out.println("集合的长度是:"+c);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
