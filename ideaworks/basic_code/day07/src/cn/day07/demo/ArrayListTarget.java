package cn.day07.demo;

//import cn.arraylist.student.String;

import java.util.ArrayList;

public class ArrayListTarget {
    public static void main(java.lang.String[] args) {
        //创建集合对象
        ArrayList<String> list=new ArrayList<>();

        //创建学生对象
        String s1=new String("周凌云");
        String s2=new String("王小平");
        String s3=new String("晓阳");

        //添加学生对象到数组中
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //遍历集合打印输出
        for (int i = 0; i < list.size(); i++) {
            String s=list.get(i); //获取数组下标,用来指导学生对象具体成员
            System.out.println(s);
        }
    }
}
