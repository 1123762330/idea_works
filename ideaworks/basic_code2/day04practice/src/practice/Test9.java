package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test9 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1930, "乌拉圭");
        map.put(1934, "意大利");
        map.put(1938, "意大利");
        map.put(1950, "乌拉圭");
        map.put(1954, "西德");
        map.put(1958, "巴西");
        map.put(1962, "巴西");
        map.put(1966, "英格兰");
        map.put(1970, "巴西");
        map.put(1974, "西德");
        map.put(1978, "阿根廷");
        map.put(1982, "意大利");
        map.put(1986, "阿根廷");
        map.put(1990, "西德");
        map.put(1994, "巴西");
        map.put(1998, "法国");
        map.put(2002, "巴西");
        map.put(2006, "意大利");
        map.put(2010, "西班牙");
        map.put(2014, "德国");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份");
        Integer year = sc.nextInt();

        boolean key = map.containsKey(year);//判断是否包含年份键
        if (key == false) {
            System.out.println("该年没有举办世界杯");
        } else {//如果集合中有这个字符,那么次数自增
            String value = map.get(year);//获取这个值
            System.out.println(year + "获得世界杯冠军的是:" + value);
        }

        System.out.println("请输入国家");
        String guojia=sc.next();
        boolean b = map.containsValue(guojia);//如果map集合中有这个国家,返回true

        //遍历map循环
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        if(b==false){
            System.out.println("没有获得世界杯");
        }else {
            for (Map.Entry<Integer, String> entry : set) {
                Integer y = entry.getKey();
                String value = entry.getValue();

                if (guojia.equals(value)) {//如果输入的国家等于元素中的国家,那就输出年份
                    System.out.println(y);
                }
            }
        }

    }
}
