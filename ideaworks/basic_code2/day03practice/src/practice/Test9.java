package practice;

import java.util.ArrayList;
import java.util.Collections;

/*九、ArrayList集合中有如下内容： {33,11,77,55}，
使用Collections.sort()对ArrayList集合中的数据进行排序，并打印出排序后的结果。*/
public class Test9 {
    public static void main(String[] args) {
        CollectionsMethod();
    }

    private static void CollectionsMethod() {
        ArrayList<Integer> list=new ArrayList<>();//创建集合
        Collections.addAll(list,33,11,77,55);//将元素全部加入到集合中
        Collections.sort(list);//把元素进行排序
        System.out.println(list);
    }
}
