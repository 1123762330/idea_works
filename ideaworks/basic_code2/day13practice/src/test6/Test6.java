package test6;

import java.util.stream.Stream;

/*有如下整数1，-2，-3，4，-5
使用Stream取元素绝对值并打印*/
public class Test6 {
    public static void main(String[] args) {
        //创建Stream流
        Stream<Integer> stream = Stream.of(1, -2, -3, 4,-5);

        //使用Lambda表达式
        /*stream.map((n)->Math.abs(n));*/

        //优化Lambda表达式
        stream.map(Math::abs).forEach(System.out::println);
    }
}
