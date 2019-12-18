package test1;

import java.util.function.Predicate;
import java.util.stream.Stream;

/*1.请在测试类main方法中完成以下需求
        已知有Integer[] arr = {-12345, 9999, 520, 0,-38,-7758520,941213}
        a)使用lambda表达式创建Predicate对象p1,p1能判断整数是否是自然数(大于等于0)
        b)使用lambda表达式创建Predicate对象p2,p2能判断整数的绝对值是否大于100
        c)使用lambda表达式创建Predicate对象p3,p3能判断整数是否是偶数

        遍历arr，仅利用已创建的Predicate对象(不使用任何逻辑运算符)，完成以下需求
        i.打印自然数的个数
        ii.打印负整数的个数
        iii.打印绝对值大于100的偶数的个数
        iv.打印是负整数或偶数的数的个数*/
public class test1 {
    public static void main(String[] args) {
        Integer[] arr = {-12345, 9999, 520, 0, -38, -7758520, 941213};
        //a)使用lambda表达式创建Predicate对象p1,p1能判断整数是否是自然数(大于等于0)
        Predicate<Integer> p1 = (n) -> n >= 0;
        //b)使用lambda表达式创建Predicate对象p2,p2能判断整数的绝对值是否大于100
        Predicate<Integer> p2 = (n) -> Math.abs(n) > 100;
        //c)使用lambda表达式创建Predicate对象p3,p3能判断整数是否是偶数
        Predicate<Integer> p3 = (n) -> n % 2 == 0;
        //Stream.of(arr).forEach((n)-> System.out.println(n));
        //遍历数组
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for (Integer i : arr) {
            if (p1.test(i)) {
                count1++;
            }
            if (p1.negate().test(i)) {
                count2++;
            }
            if (p1.and(p2).test(i)) {
                count3++;
            }
            if(p1.negate().or(p3).test(i)){
                count4++;
            }
        }

        System.out.println("自然数的个数:"+count1);
        System.out.println("负整数的个数:"+count2);
        System.out.println("绝对值大于100的偶数的个数:"+count3);
        System.out.println("负整数或偶数的数的个数:"+count4);
    }
}
