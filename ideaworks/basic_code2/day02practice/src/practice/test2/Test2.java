package practice.test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*1.定义集合，存入多个字符串
2.删除集合中字符串"def"
3.然后利用迭代器遍历集合元素并输出*/
public class Test2 {
    public static void main(String[] args) {
        //定义集合
        Collection<String> coLl = new ArrayList<>();
        //存储字符串
        coLl.add("asc");
        coLl.add("def");
        coLl.add("cfg");
        coLl.add("def");

        //删除集合中字符串"def"
        /*coLl.remove("def");//返回的是一个布尔值*/
        while (coLl.contains("def")){
            coLl.remove("def");
        }
        //创建迭代器
        Iterator<String> it = coLl.iterator();
        //迭代遍历输出
        while (it.hasNext()){
            String str=it.next();//获取具体的字符串
            System.out.println(str);//输出具体的字符串
        }
    }
}
