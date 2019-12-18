package test2;

import java.util.*;
import java.util.function.Function;

/*1.使用lambda表达式分别将以下功能封装到Function对象中
        a)求Integer类型ArrayList中所有元素的平均数
        b)将Map<String,Integer>中value存到ArrayList<Integer>中*/
public class Test2 {
    public static void main(String[] args) {
        //创建map集合,将元素添加到集合中
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("岑小村", 59);
        map.put("谷天洛", 82);
        map.put("渣渣辉", 98);
        map.put("蓝小月", 65);
        map.put("皮几万", 70);
        //getAVG(map);//求平均数

        //a)   求Integer类型ArrayList中所有元素的平均数
        Function<ArrayList<Integer>,Integer> f1 = (list)->{
            Integer sum = 0;
            for (Integer i : list) {
                sum+=i;
            }
            return sum/list.size();
        };

        //b)   将Map<String,Integer>中value存到ArrayList<Integer>中
        Function<Map<String,Integer>,ArrayList<Integer>> f2 = (map1)->{
            Collection<Integer> values = map1.values();
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(values);
            return list;
        };

        //利用Function求平均成绩
        Integer avg = f2.andThen(f1).apply(map);
        System.out.println("学生平均成绩为："+avg);


    }

    private static void getAVG(Map<String, Integer> map) {
        //创建Arraylist集合存放成绩
        ArrayList<Integer> list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        //遍历keySet集合
        int sum=0;
        for (String s : keySet) {
            list.add(map.get(s));//将value值添加到集合中
            sum +=map.get(s);//遍历元素相加
        }
        //将总和除以元素个数并输出
        double i = sum*1.00 / keySet.size();
        System.out.println(list);
        System.out.println("平均数:"+i);
    }
}
