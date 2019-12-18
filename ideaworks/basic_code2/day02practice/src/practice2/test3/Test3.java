package practice2.test3;

import java.util.ArrayList;
import java.util.Collection;

//定义一个集合，存储一些元素。并使用增强for循环遍历输出
public class Test3 {
    public static void main(String[] args) {
        //创建集合
        Collection<String> coll = new ArrayList<>();

        //存储元素
        coll.add("你好");
        coll.add("我好");
        coll.add("她也好");
        coll.add("大家好");

        //使用增强for循环遍历输出
        for( String s:coll) {
            System.out.println(s);
        }
    }
}
