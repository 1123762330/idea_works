package test10;

import java.security.Key;
import java.util.*;
import java.util.function.Consumer;

/*2.	分别使用lambda表达式完成以下需求
        a)	打印谷天洛的分数
        b)	打印最高分
        c)	分别以60分和70分为及格线，打印及格的人的名字(组合型消费)*/

public class Test10 {
    public static <T> void doJob(T t, Consumer<T> consumer) {
        consumer.accept(t);
    }
    public static <T> void doJob(T t, Consumer<T> consumer1, Consumer<T> consumer2) {
        consumer1.andThen(consumer2).accept(t);
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("岑小村",59);
        map.put("谷天洛",82);
        map.put("渣渣辉",98);
        map.put("蓝小月",65);
        map.put("皮几万",70);
        //遍历数组求谷天洛的分数
        method(map);
        //求最高分数
        getMax(map);
        //求及格的人
        method3(map);
        doJob(map,(s)-> System.out.println(map.get("谷天洛")));
        //求最大数
        ArrayList<Integer> list = new ArrayList<>();
        doJob(map,(s)->{
            Set<Map.Entry<String, Integer>> entrySet= s.entrySet();
            for (Map.Entry<String, Integer> entry : entrySet) {
                list.add(entry.getValue());
                Collections.sort(list);
            }
        },(l)->System.out.println(list.get(list.size() - 1)));
    }

    private static void method3(HashMap<String, Integer> map) {
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            Integer value = entry.getValue();
            if(value>60){
                String key = entry.getKey();
                System.out.println("及格人是:"+key+":"+value);
            }
        }
    }

    private static void getMax(HashMap<String, Integer> map) {
        ArrayList<Integer> list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            Integer integer = map.get(s);
            list.add(integer);
            Collections.sort(list);
        }
        Integer max = list.get(list.size() - 1);
        System.out.println("最高分数是:"+max);
    }

    private static void method(HashMap<String, Integer> map) {
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            Integer i = map.get(s);
            if(s.equals("谷天洛")){
                System.out.println("谷天洛的分数为:"+i);
            }
        }
    }
}


