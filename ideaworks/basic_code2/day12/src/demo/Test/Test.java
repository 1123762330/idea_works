package demo.Test;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        //定义一个储存字符串的数组
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };

        //调用方法
        ArrayList<String> list = filter(array, (s) -> {
            return s.split(",")[1].equals("女");//进行字符串切割,拿到性别进行比较
        }, (s) -> {
            return s.split(",")[0].length() == 4;//进行字符串切割,拿到姓名进行比较
        });

        //遍历集合,输出打印
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static ArrayList<String> filter(String[] arr, Predicate<String>pre1,Predicate<String>pre2) {
        ArrayList<String> list = new ArrayList<>();//定义一个集合存储过滤之后的元素
        for (String s : arr) {//遍历进行比较
            boolean b = pre1.and(pre2).test(s);
            if(b){//如果符合那就添加到集合中
                list.add(s);
            }
        }
        return list;
    }
}
