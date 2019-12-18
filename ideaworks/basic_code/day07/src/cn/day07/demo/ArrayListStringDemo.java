package cn.day07.demo;

import java.util.ArrayList;
//输出{黄药师@黄蓉@}
public class ArrayListStringDemo {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list=new ArrayList<>();

        //创建对象
        String str1=("黄药师");
        String str2=("黄蓉");
        String str3=("梅超风");

        //添加对象
        list.add(str1);
        list.add(str2);
        list.add(str3);


        //遍历数组
        System.out.print("{");
        for (int i = 0; i <list.size(); i++) {
            String name=list.get(i);
            if(i==list.size()-1){//如果索引等于最后一位,那么就输出最后的}
                System.out.print(name+"}");
            }else {
                System.out.print(name + "@");
            }
        }
    }

}
