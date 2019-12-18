package practice_teacher.test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
第二题：分析以下需求，并用代码实现
	1.定义集合，存入多个字符串
	2.删除集合中字符串"def"
	3.然后利用迭代器遍历集合元素并输出
 */
public class Test2 {
    public static void main(String[] args) {
        //定义集合，存入多个字符串
        Collection<String> list = new ArrayList<>();
        list.add("123");
        list.add("def");
        list.add("456");
        list.add("def");
        list.add("abc");
        list.add("def");
        //System.out.println(list);
        //方式一:直接删除,会漏掉一些元素
        //list.remove("def");

        //方式二:通过迭代器获取元素,然后删除会产生并发修改异常
       /*for (String str : list) {
            //判断从集合中取出来的字符串str是不是"def"
            if (str.equals("def")){
                list.remove(str);
            }
        }
        System.out.println(list);*/

       //a.使用普通for循环,注意向下转型
       /* for (int i = 0; i < list.size(); i++) {
            //因为Collection集合没有get()方法,所以需要将Collection集合向下转型成ArrayList集合
            ArrayList<String> array = (ArrayList<String>) list;
            String str = array.get(i);
            if (str.equals("def")){
                array.remove(str);
                i--;
            }
        }*/

        //b.判断集合中是否包含字符串"def"
        while (list.contains("def")){
            list.remove("def");
        }

        //c.循环删除
        while (list.remove("def")){
        }

        //利用迭代器遍历集合元素
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String num = iterator.next();
            System.out.println(num);
        }
    }

}
