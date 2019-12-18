package practice.test3;
/*1.有如下代码：
public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("c");
        list.add("c");
        list.add("a");
        list.add("d");
        }
        2.定义一个noRepeat()方法,要求对传递过来集合中进行元素去重
public static void noRepeat(ArrayList<String> al){}
*/

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("c");
        list.add("c");
        list.add("a");
        list.add("d");

        noRepeat(list);//调用方法
    }

    public static void noRepeat(ArrayList<String> al) {

        //要求对传递过来集合中进行元素去重
        //定义新的集合,存储不重复元素
        ArrayList<String> list = new ArrayList<>();

        //遍历传递过来集合al
        for (String str : al) {
            //判断新的集合中有没有取出来的字符串str
            if (!list.contains(str)) {
                //如果集合中不包含这个字符串,就把这个字符串添加到新的集合中
                list.add(str);
            }
        }
        System.out.println(list);

        /*//遍历集合获取具体数据
        for (int i = 0; i < al.size(); i++) {
            //获取字符串,将它与后面的字符串值进行比较
            String str=al.get(i);
            //获取后面的元素
            for (int j =i+1;j<al.size();j++ ) {
                if(str.equals(al.get(j))){//如果0索引上的元素等于1索引的元素,那就删除1索引上的数字
                    al.remove(j);
                }
            }
        }
        System.out.println(al);*/
    }
}
