package practice_teacher.test3;

import java.util.ArrayList;

/*
第三题：分析以下需求，并用代码实现
	1.有如下代码：
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
		public static void noRepeat(ArrayList<String> al){

		}
 */
public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("c");
        list.add("c");
        list.add("a");
        list.add("d");

        //调用方法
        noRepeat(list);
    }

    public static void noRepeat(ArrayList<String> al){
        //要求对传递过来集合中进行元素去重
        //定义新的集合,存储不重复元素
        ArrayList<String> list = new ArrayList<>();
        //遍历传递过来集合al
        for (String str : al) {
            //判断新的集合中有没有取出来的字符串str
            if (!list.contains(str)){
                //如果集合中不包含这个字符串,就把这个字符串添加到新的集合中
                list.add(str);
            }
        }
        System.out.println(list);
    }
}
