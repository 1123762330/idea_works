package demo.list_demo;
/*
分析以下需求，并用代码实现
1.	利用键盘录入，输入一个字符串
2.	统计该字符串中各个字符的数量(提示:字符不用排序)
3.	如：
用户输入字符串"If~you-want~to~change-your_fate_I_think~you~must~come-to-the-dark-horse-to-learn-java"
程序输出结果：-(9)I(2)_(3)a(7)c(2)d(1)e(6)f(2)g(1)h(4)i(1)j(1)k(2)l(1)m(2)n(4)o(8)r(4)s(2)t(8)u(4)v(1)w(1)y(3)~(6)
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapParctice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = sc.next();
        //首先将字符串转成字符数组
        char[] chars = str.toCharArray();
        //创建一个map集合用来存放遍历出来的字符
        HashMap<Character, Integer> map = new HashMap<>();

        //然后遍历字符数组
        for (char ch : chars) {
//         if(!map.containsKey(ch)){//如果集合中不包含这个键,那么这个元素就添加到集合中,并记一次次数
//            map.put(ch,1);
//          }else {//如果集合中有这个字符,那么次数自增
//            int count=map.get(ch);//获取这个值
//            map.put(ch,count+1);//次数增加
//          }

            //也可以用三元运算符进行遍历
            map.put(ch, !map.containsKey(ch) ? 1 : map.get(ch) + 1);
        }


        //System.out.println(map);

        //遍历集合进行格式输出
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();//获取键
            Integer value = entry.getValue();//获取值
            System.out.print(key + "(" + value + ")");
        }
    }
}
