package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*现在有两个List集合存储队伍当中的多个成员姓名，要求使用Stream流的方式依次
        进行以下若干操作步骤：
        第一个队伍：{"tom", "kobe", "jordan", "tracy","westbook","yaoming","ace","stephen"}
        第二个队伍：{"beyonce", "jay_z", "adele", "taylor","bieber","ladygaga"}
        1：第一个队伍只要名字长度大于4的前三名
        2：第二个队伍只要名字中带有a的;筛选后不要第一个
        3：将两个队伍合并为一个队伍,并最终转换为List集合
        4：将最终的队伍中的名字按照名字的字母降序排列（非自然顺序，与自然排序相反，如zyx...cba）
        5：使用foreach进行遍历打印最终的名字*/
public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        String[] arr={"tom", "kobe", "jordan", "tracy","westbook","yaoming","ace","stephen"};
        String[] arr2={"beyonce", "jay_z", "adele", "taylor","bieber","ladygaga"};
        Collections.addAll(list, arr);
        Collections.addAll(list2,arr2);
        //1：第一个队伍只要名字长度大于4的前三名
        Stream<String> stream = list.stream().filter(s -> s.length() == 4);
        //2：第二个队伍只要名字中带有a的;筛选后不要第一个
        Stream<String> stream1 = list2.stream().filter(s -> s.contains("a")).skip(1);
        //3：将两个队伍合并为一个队伍,并最终转换为List集合
        List<String> list3 = Stream.concat(stream, stream1).collect(Collectors.toList());
        //4：将最终的队伍中的名字按照名字的字母降序排列（非自然顺序，与自然排序相反，如zyx...cba）
        //匿名内部类
        /*list3.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.charAt(0)-o1.charAt(0);
            }
        });*/
        //使用Lambda表达式
        list3.sort((o1, o2) -> o2.charAt(0)-o1.charAt(0));
        //5：使用foreach进行遍历打印最终的名字
        list3.forEach(System.out::println);
    }
}
