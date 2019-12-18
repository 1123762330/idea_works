package demo;

import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        //创建一个Stream流对象
        Stream<String> stream = Stream.of("1", "2", "3", "4");

        //使用map方法进行转换
        /*Stream<Integer> stream1 = stream.map((String s) -> {
            return Integer.parseInt(s);
        });
        //遍历显示结果
        stream1.forEach((i)-> System.out.println(i));
        */
        //继续优化
        stream.map( s -> Integer.parseInt(s)).forEach( i -> System.out.println(i));


    }
}
