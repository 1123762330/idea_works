package practice;

import java.util.ArrayList;
import java.util.Collections;

//向list集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫替换为王小丫。
public class Test7 {
    public static void main(String[] args) {
        show();
    }

    private static void show() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三","李四","王五","二丫","钱六","孙七");
        System.out.println(list);
        list.set(3,"王小丫");
        System.out.println("更改后的集合元素为:"+list);

    }
}
