package practice;

import java.util.*;

/*已知数组存放一批QQ号码，QQ号码最长为11位，
最短为5位String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，
将list中所有元素分别用迭代器和增强for循环打印出来。*/
public class Test10 {
    public static void main(String[] args) {
            method();
    }

    private static void method() {
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedList<String> list = new LinkedList<>();//创建新集合
        Collections.addAll(list,strs);//将字符串数组添加到集合中
        HashSet<String> list2 = new HashSet<>();//创建不重复的集合
        list2.addAll(list);//添加到集合中

        //增强for循环
        for (String s:list2) {
            System.out.print(s+" ");
        }
        System.out.println();

        //迭代遍历
        Iterator<String> iterator = list2.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

    }
}
