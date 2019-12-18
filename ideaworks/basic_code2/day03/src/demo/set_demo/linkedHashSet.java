package demo.set_demo;

import java.util.LinkedHashSet;
//元素有序排列
public class linkedHashSet {
    public static void main(String[] args) {
//创建HashSet集合
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        //存储元素
        linkedHashSet.add("java");
        linkedHashSet.add("world");
        linkedHashSet.add("hello");
        linkedHashSet.add("java");


        //遍历集合,第一种方法增强for
        for (String s:linkedHashSet) {
            System.out.println(s);
        }
    }
}
