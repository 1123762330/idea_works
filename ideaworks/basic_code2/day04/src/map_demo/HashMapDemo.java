package map_demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//HashMap集合的常用方法
public class HashMapDemo {
    public static void main(String[] args) {
        //创建HashMap集合
        HashMap<Integer, String> map = new HashMap<>();//双列集合

        //添加元素到集合中
        map.put(1,"小明");
        map.put(2,"小红");
        map.put(3,"大明");

        /*//删除元素
        String removeName = map.remove(1);//删除键1的元素
        System.out.println("删除的是:"+removeName);*/

        /*//清空集合
        map.clear();
        if(map.isEmpty()){
            System.out.println("集合已经清空");
        }*/

        //获取元素
        String value = map.get(2);//获取的是2键上的值
        System.out.println(value);

        //遍历map集合,第一种使用键找值KeySet
        Set<Integer> KeySet= map.keySet();
        for (Integer key:KeySet) {
            String value2 = map.get(key);
            System.out.println(key+"->"+value2);
        }
        //遍历map集合,第二种使用entrySet
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> yuansu:entrySet) {
            Integer key = yuansu.getKey();
            String value3 = yuansu.getValue();
            System.out.println(key+"->"+value3);
        }

    }


}
