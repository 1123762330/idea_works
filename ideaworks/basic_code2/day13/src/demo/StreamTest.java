package demo;

import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        //创建一个Stream流对象
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵柳");
        //创建Stream流对象
        Stream<String> stream1 = Stream.of("喜洋洋", "沸羊羊", "懒洋洋","老洋洋");
        //调用concat方法,将两个流合并成为一个流对象
        Stream<String> stream2 = Stream.concat(stream, stream1);
        //计算元素的个数
        System.out.println("元素的个数为:"+stream2.count());


        //创建一个Stream流对象
        Stream<String> str1= Stream.of("张三", "李四", "王五", "赵柳","张无忌","卓志若");
        //创建Stream流对象
        Stream<String> str2 = Stream.of("喜洋洋", "沸羊羊", "懒洋洋","老洋洋");
        //调用concat方法,将两个流合并成为一个流对象
        Stream<String> str3 = Stream.concat(str1, str2);
        //只需要留下长度为3的元素
        Stream<String> str4 = str3.filter((s) -> s.length() == 3);
        //遍历输出
        str4.forEach((s)-> System.out.print(s+","));
    }
}
