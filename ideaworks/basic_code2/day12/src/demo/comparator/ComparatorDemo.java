package demo.comparator;

import java.util.Arrays;
import java.util.Comparator;


public class ComparatorDemo {
    public static void main(String[] args) {
        String[] arr={"aaa","b","cccc","ddddddddd"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,getComparator());
        System.out.println(Arrays.toString(arr));
    }

    public static Comparator<String> getComparator() {
        //使用匿名内部类
        /*return new Comparator<String>() {
             @Override
             public int compare(String o1, String o2) {
                 return o2.length()-o1.length();
             }
         };*/

        //使用Lambda表达式
        /*return (String o1,String o2)->{return o2.length()-o1.length();};*/
        //继续优化
        return (o1, o2) -> o2.length()-o1.length();
    }

}
