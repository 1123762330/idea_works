package practice_teacher.test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/*
第一题：分析以下需求，并用代码实现
	1.生成10个1至100之间的随机整数(不能重复)，存入一个集合
	2.然后利用迭代器和增强for循环分别遍历集合元素并输出
	3.如：15 18 20 40 46 60 65 70 75 91

	Collection接口--->List接口--->ArrayList实现类
 */
public class Test1 {
    public static void main(String[] args) {
        //创建集合对象,存储数字
        Collection<Integer> list = new ArrayList<>();

        //创建随机数对象
        Random ra = new Random();
        for (int i = 0; i < 10; i++) {
            //生成随机数,范围1到100
            int num = ra.nextInt(100)+1;
            //如果集合中不包含这个随机数,就把这个数存入集合
            if (!list.contains(num)){
                //向集合中存储数据
                list.add(num);
            }else{
                //如果集合中包含这数字,需要重新生成
                i--;
            }
        }
        //System.out.println(list);
        //遍历集合,方式一:迭代器
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer num = iterator.next();
            System.out.println(num);
        }
        //遍历集合,方式二:增强for循环
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}
