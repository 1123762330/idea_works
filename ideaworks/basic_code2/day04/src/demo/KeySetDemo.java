package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class KeySetDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //添加数据到map集合中
        map.put("001",18);
        map.put("002",19);
        map.put("003",20);

        //将map键值取出放入set集合中,map集合条用KeySet方法
        Set<String> keySet = map.keySet();

        //使用增强for循环进行遍历
        for (String jian:keySet) {//键是什么类型,前面就是什么类型
            Integer value = map.get(jian);//通过键获取值
            System.out.println(jian+"="+value);
        }

        //迭代遍历
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()){
            String key = it.next();//遍历键集合,获取具体的键
            Integer value = map.get(key);//通过具体的键获取具体的值
            System.out.println(key+"="+value);
        }
    }
}
