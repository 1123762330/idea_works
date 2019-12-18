package test2;
/*1.产生10个1-20之间的随机数要求随机数不能重复
2.产生10个长度为10的不能重复的字符串(里面只能出现大写字母、小写字母、0-9的数字)，并遍历打印输出*/

import java.util.HashSet;
import java.util.Random;

public class Test2_1 {
    public static void main(String[] args) {
        //产生10个1-20之间的随机数要求随机数不能重复
        HashSet<Integer> set = new HashSet<>();
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            Integer num=ran.nextInt(20)+1;
            if(!set.contains(num)){
                set.add(num);
            }else {
                i--;
            }
        }
        System.out.println(set);

        //产生10个长度为10的不能重复的字符串
        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        /*String s="";
        String s1="";*/
        for (int i = 0; i < 10; i++) {
            String s="";
            for (int i1 = 0; i1 < 10; i1++) {
                int index = ran.nextInt(62);
                char ch=str.charAt(index);
                s+=ch;
            }
            System.out.println(s+"");

        }

        /*for (int i = 0; i < 2; i++) {
            //String s="";
            for (int i1 = 0; i1 < 5; i1++) {
                int index = ran.nextInt(62);
                char ch=str.charAt(index);
                s+=ch;
                System.out.println(s+"");
            }
            //System.out.println(s+"");
        }*/


    }
}
