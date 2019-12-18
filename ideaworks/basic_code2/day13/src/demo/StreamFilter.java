package demo;

import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
        //创建一个Stream流对象
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵柳");

        //使用filter方法,根据条件进行过滤
       /* Stream<String> stream1 = stream.filter((name) -> {
            return name.startsWith("张");
        });*/

        //继续优化
        stream.filter(name -> name.startsWith("张"))
              .forEach((name)-> System.out.println(name));
    }
}
