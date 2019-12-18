package demo;

import java.util.ArrayList;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("托龙岛");
        list.add("张无忌");
        list.add("周芷若");
        list.add("张三");
        //寻找姓张的人,名字是三个字,输出打印出来
        list.stream().filter(name -> name.startsWith("张"))
                     .filter(name -> name.length() == 3)
                     .forEach(name -> System.out.println(name));
    }
}
