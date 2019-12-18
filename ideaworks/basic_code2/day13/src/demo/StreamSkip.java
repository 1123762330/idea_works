package demo;

import java.util.stream.Stream;

public class StreamSkip {
    public static void main(String[] args) {
        //创建Stream流对象
        Stream<String> stream = Stream.of("喜洋洋", "沸羊羊", "懒洋洋","老洋洋");
        //调用Skip方法,跳过前面几个元素,截取后面的元素
        Stream<String> stream1 = stream.skip(2);
        //遍历输出
        stream1.forEach(s -> System.out.println(s));
    }
}
