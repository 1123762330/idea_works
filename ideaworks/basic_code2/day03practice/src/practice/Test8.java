package practice;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

//八、使用LinkedHashSet存储以下元素："王昭君","王昭君","西施","杨玉环","貂蝉"。
// 使用迭代器和增强for循环遍历LinkedHashSet。
public class Test8 {
    public static void main(String[] args) {
        LinkedHashSetMethod();
    }

    private static void LinkedHashSetMethod() {
        //创建LinkedHashSet集合
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        //使用工具类添加所有元素
        Collections.addAll(lhs,"王昭君","王昭君","西施","杨玉环","貂蝉");//返回的是布尔值
        //迭起器遍历
        Iterator<String> iterator = lhs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("增强for遍历:");
        //增强for循环遍历
        for (String name:lhs) {
            System.out.println(name);
        }

    }
}
