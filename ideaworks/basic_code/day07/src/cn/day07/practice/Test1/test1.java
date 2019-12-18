package cn.day07.practice.Test1;

import java.util.ArrayList;
import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        //1. ArrayList练习之存储随机数字
        //定义数字集合
        ArrayList<Integer> list = new ArrayList<>();

        //定义Random对象
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            int r = ran.nextInt(20);
            list.add(r);
        }
        System.out.println(list);

        //2. ArrayList练习之存储自定义对象
        //定义自定义对象
        ArrayList<Person> list1=new ArrayList<>();
        //创建person对象
        Person p=new Person("大哥",30);
        Person p1=new Person("二哥",23);
        //添加到集合中
        list1.add(p);
        list1.add(p1);
        for (int i = 0; i < list1.size(); i++) {
            Person people=list1.get(i);
            System.out.println(people.getName()+people.getAge()+" ");
        }

        //3. ArrayList练习之按指定格式遍历集合字符串
        ArrayList<String> list3=new ArrayList<>();
        String s=new String("我站在高山之巅");
        String s1=new String("俯视这苍茫大地");
        list3.add(s);
        list3.add(s1);
        for (int i = 0; i < list3.size(); i++) {
            String str=list3.get(i);
            System.out.println(str);
        }

        //4. ArrayList练习之筛选集合中的随机数
        //定义数字集合
        ArrayList<Integer> list4 = new ArrayList<>();

        //定义Random对象
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int r = ran.nextInt(100);
            list4.add(r);
        }

        for (int i = 0; i < list4.size(); i++) {
            int num=list4.get(i);
            if(num>10){
                System.out.print(num+" ");
            }else {
                break;
            }
        }
    }
}
