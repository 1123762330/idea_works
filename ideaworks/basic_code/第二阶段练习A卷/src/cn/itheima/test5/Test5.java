package cn.itheima.test5;
/*
public static ArrayList<String> filter(ArrayList<String> list，String str) {}
在main方法中完成以下要求：
定义一个集合list，集合中的元素有："itcast","itheima","baidu","weixin","zhifubao"
调用filter方法传入list集合和字符串”it”，输出返回的集合中所有元素
示例如下：
返回的集合中所有元素:
itcast  itheima

*/

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String str = "it";
        list.add("itcast");
        list.add("itheima");
        list.add("baidu");
        list.add("weixin");
        list.add("zhifubao");
        System.out.println(filter(list, str));

    }

    public static ArrayList<String> filter(ArrayList<String> list, String str) {
        ArrayList<String> strlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            //要求: 遍历集合，将集合中包含参数str的元素存入另一个集合中并返回
            String string = list.get(i);
            if (string.contains("it")) {//判断字符串中是否有it字符
                strlist.add(string);//有就添加到集合中
            }
        }
        return strlist;//返回集合
    }
}
