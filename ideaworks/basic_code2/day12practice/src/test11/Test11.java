package test11;
/*a)	将五名学生添加到ArrayList集合
        b)	使用Collections.sort(List<T> list, Comparator<? super T> c)方法将学生成绩从小到大进行排序（忽略非空判断）
        i.	使用匿名内部类
        ii.	使用Lambda表达式
        iii.	使用方法引用	//tips:借助Comparator接口中静态方法comparingInt()方法*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test11 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("谢霆锋",85));
        list.add(new Student("章子怡",63));
        list.add(new Student("刘亦菲",77));
        list.add(new Student("黄晓明",33));
        list.add(new Student("岑小村",92));
        Collections.sort(list , (o1, o2) -> o1.getScore()-o2.getScore());
        System.out.println(list.toString());
    }
}
