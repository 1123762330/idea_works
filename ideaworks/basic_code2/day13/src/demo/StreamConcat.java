package demo;

import java.util.stream.Stream;

public class StreamConcat {
    public static void main(String[] args) {
        //创建一个Stream流对象
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵柳");
        //创建Stream流对象
        Stream<String> stream1 = Stream.of("喜洋洋", "沸羊羊", "懒洋洋","老洋洋");
        //调用concat方法,将两个流合并成为一个流对象
        Stream<String> stream2 = Stream.concat(stream, stream1);
        //遍历输出
        stream2.forEach(s -> System.out.print(s+","));
    }
}
