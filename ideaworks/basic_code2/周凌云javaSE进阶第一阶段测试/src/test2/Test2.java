package test2;
/*1.产生10个1-20之间的随机数要求随机数不能重复
2.产生10个长度为10的不能重复的字符串(里面只能出现大写字母、小写字母、0-9的数字)，并遍历打印输出*/

import java.util.HashSet;
import java.util.Random;

public class Test2 {
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
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                '0', '1', '2', '3', '4', '5','6', '7', '8', '9'};
        for (int i = 0; i < 10; i++) {
            String str="";
            while (str.length()!=10){
                int n = ran.nextInt(62);
                if (!str.contains((arr[n])+"")) {
                    str+=arr[n];
                }
            }
            System.out.println(str);
        }
    }
}
