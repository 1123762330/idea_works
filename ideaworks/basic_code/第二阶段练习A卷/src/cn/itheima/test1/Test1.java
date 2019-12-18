package cn.itheima.test1;

import java.util.ArrayList;
/*定义一个集合存储字符串,包含如下元素"itrator","cat","story","NB666";
 遍历集合拿到每个元素,获取每个元素的前两个字符拼接成新的字符串打印到控制台*/

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();//创建集合
        //添加元素
        list.add("itrator");
        list.add("cat");
        list.add("story");
        list.add("NB666");
        //遍历集合
        String str3="";
        for (int i = 0; i < list.size(); i++) {
            str3+=list.get(i).substring(0,2);//字符串拼接
        }
        System.out.print(str3);
    }
}
