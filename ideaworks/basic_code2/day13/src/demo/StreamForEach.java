package demo;

import java.util.stream.Stream;

public class StreamForEach {
    public static void main(String[] args) {
        //创建一个Stream流对象
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵柳");

        //使用forEach进行遍历
       /* stream.forEach((String name)->{
            System.out.println(name);
        });*/

       //进行优化
       stream.forEach(name-> System.out.println(name));
    }
}
