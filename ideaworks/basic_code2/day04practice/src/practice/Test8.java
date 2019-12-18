package practice;

import java.util.*;

/*八、定义一个泛型为String类型的List集合，统计该集合中每个字符（注意，不是字符串）出现的次数。
例如：集合中有”abc”、”bcd”两个元素，程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。*/
public class Test8 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//定义集合
        list.add("abc");
        list.add("bcd");

        //创建一个不重复数组来存放字符
        HashMap<Character, Integer> map = new HashMap<>();

        //遍历字符串数组
        for (String str : list) {
            char[] chars = str.toCharArray();//字符串转成字符数组
            //遍历字符数组并进行判断
            for (char key : chars) {
                //如果map集合不包含这个键,那就记一次数,否则键值次数+1
                map.put(key, !map.containsKey(key) ? 1 : map.get(key) + 1);
            }
        }

        //遍历数组
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();//获取键
            Integer value = entry.getValue();//获取值
            System.out.print(key + "=" + value + ", ");
        }
    }
}
