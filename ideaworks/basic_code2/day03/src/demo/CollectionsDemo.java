package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
    public static void main(String[] args) {

        //创建ArrayList集合
        ArrayList<Integer> list = new ArrayList<>();

        //向集合中添加一些元素
        Collections.addAll(list,1,35,13,46);

        //打乱集合顺序
        Collections.shuffle(list);
        System.out.println(list);

        //将集合按照升序方法排序
        Collections.sort(list);
        System.out.println(list);

        //将集合按照自定规则排序,使用自定规则排序的就需要new Comparator
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(list);

    }
}
