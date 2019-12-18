package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntrySetDemo {
    public static void main(String[] args) {
        //创建map集合
        HashMap<String, Integer> map = new HashMap<>();

        //添加数据到map集合中
        map.put("001", 18);
        map.put("002", 19);
        map.put("003", 20);

        //调用EntrySet方法,把元素的键和值都存储到set集合中,
        //Map.Entry<String, Integer>其实就是一个泛型,简单点来说就是一个数据类型
        Set<Map.Entry<String, Integer>> set = map.entrySet();

        //使用增强for进行遍历,获取具体的元素,然后获取元素的键和值
        for (Map.Entry<String, Integer> entry : set) {
            //获取键
            String key = entry.getKey();
            //获取value值
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        //使用迭代器遍历
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            //获取键
            String key = entry.getKey();
            //获取value值
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
