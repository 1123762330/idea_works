package practice;

import java.util.LinkedList;

/*五、根据要求练习LinkedList方法：
（1）基本方法：add, set, get, remove, clear, size等方法；
（2）特有方法：addFirst, addLast, getFirst, getLast, removeFirst,removeLast, push, pop, clear等方法。*/
public class Test5 {
    public static void main(String[] args) {
        jichu();
        add();
        getMethod();
        removeMethod();
    }

    private static void jichu() {
        LinkedList<String> list = new LinkedList<>();
        //基本方法
        list.add("你好");
        list.add("大哥");
        list.add("三妹");
        list.set(1,"二哥");
        list.remove("三妹");
        System.out.println(list);
        System.out.println(list.size());//获取数组长度
        list.clear();//清除集合
    }

    //特殊方法
    private static void removeMethod(){
        //创建集合
        LinkedList<String> list= new LinkedList<>();
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
