package test4;

import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

//有如下7个元素黄药师，冯蘅，郭靖，黄蓉，郭芙，郭襄，郭破虏，使用Stream将以郭字开头的元素存入新数组
public class Test4 {
    public static void main(String[] args) {
        String[] arr={"黄药师","冯蘅","郭靖","黄蓉","郭芙","郭襄","郭破虏"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> stream1 = stream.filter((name) -> name.startsWith("郭"));
        //使用Lambda表达式
        /*String[] array=stream1.toArray((len)->{
            return new String[len];
        });*/

        //使用匿名内部类
        String[] array1=stream1.toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });



        //优化lambda表达式
        String[] array=stream1.toArray(String[]::new);

    }
}
