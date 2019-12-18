package demo;

import java.util.stream.Stream;

public class StreamCount {
    public static void main(String[] args) {
        //创建一个Stream流
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        //调用count方法
        long count = stream.count();
        //输出显示结果
        System.out.println(count);

    }
}
