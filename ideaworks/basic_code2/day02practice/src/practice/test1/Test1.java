package practice.test1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/*分析以下需求，并用代码实现
1.生成10个1至100之间的随机整数(不能重复)，存入一个集合
2.然后利用迭代器和增强for循环分别遍历集合元素并输出
3.如：15 18 20 40 46 60 65 70 75 91*/
public class Test1 {
    public static void main(String[] args) {
        Random ran = new Random();
        Collection<Integer> coll=new HashSet();//创建一个不重复的集合

        //使用随机数随机10个不重复的数字,因为有重复,所以数组长度会变小
        for (int i = 0; i < 10; i++) {
            Integer num=ran.nextInt(100)+1;
            coll.add(num);
        }

        //如果集合长度小于10,那就继续往里加数
        while (coll.size()<10){
            coll.add(ran.nextInt(100)+1);
        }

        //增强for循环输出
        for(Integer n:coll){
            System.out.print(n+" ");
        }

        System.out.println();

        //迭代器遍历输出
        Iterator<Integer> it = coll.iterator();//创建迭代器
        //进行循环
        while(it.hasNext()){
            int number=it.next();//获取每一个具体的值
            System.out.print(number+" ");
        }


    }
}
