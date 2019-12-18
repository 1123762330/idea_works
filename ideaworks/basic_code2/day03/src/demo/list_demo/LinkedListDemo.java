package demo.list_demo;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        add();
        getMethod();
        removeMethod();
    }

    private static void removeMethod() {
        //创建集合
        LinkedList<String> list = new LinkedList<>();
        //添加数据
        list.add("a");
        list.add("b");
        list.add("c");

        String first = list.removeFirst();//删除第一个元素
        System.out.println(first);
        String last = list.removeLast();//删除最后一个元素
        System.out.println(last);
        String p=list.pop();//等同于removeFirst
        System.out.println(p);
    }

    private static void add() {
        //创建集合
        LinkedList<String> list = new LinkedList<>();
        //添加数据
        list.add("a");
        list.add("b");
        list.add("c");

        list.addFirst("首位元素");
        list.addLast("末尾元素");
        list.push("wo");//等同于addFirst
        System.out.println(list);
    }

    public static void getMethod() {
        //创建集合
        LinkedList<String> list = new LinkedList<>();
        //添加数据
        list.add("a");
        list.add("b");
        list.add("c");

        String first=list.getFirst();//获取第一个元素
        String last=list.getLast();//获取最后一个元素
        System.out.println(first);
        System.out.println(last);
    }
}
