package demo.list_demo.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList();
        coll.add("abc");
        coll.add("itcast");
        //创建迭代器
        Iterator<String> it = coll.iterator();
        //迭代遍历输出
        while (it.hasNext()) {
            String str = it.next();//获取每个元素
            System.out.println(str);
        }
    }
}
