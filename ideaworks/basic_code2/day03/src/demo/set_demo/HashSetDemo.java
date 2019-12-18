package demo.set_demo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        //创建HashSet集合
        HashSet<String> set = new HashSet<>();

        //存储元素
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("2");


        //遍历集合,第一种方法增强for
        for (String s:set) {
            System.out.println(s);
        }

        //第二种方法迭代遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }

    }
}
