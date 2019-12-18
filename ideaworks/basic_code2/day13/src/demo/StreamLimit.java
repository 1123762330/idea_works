package demo;

import java.util.stream.Stream;

public class StreamLimit {
    public static void main(String[] args) {
        //创建Stream流对象
        Stream<String> stream = Stream.of("喜洋洋", "沸羊羊", "懒洋洋");
        //调用limit方法进行截取
        Stream<String> stream1 = stream.limit(2);
        //遍历
        stream1.forEach(s -> System.out.println(s));
    }
}