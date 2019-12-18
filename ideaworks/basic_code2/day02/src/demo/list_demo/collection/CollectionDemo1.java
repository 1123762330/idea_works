package demo.list_demo.collection;

import java.util.ArrayList;
import java.util.Collection;

/*public boolean add(E e)：  把给定的对象添加到当前集合中 。
public void clear() :清空集合中所有的元素。
public boolean remove(E e): 把给定的对象在当前集合中删除。
public boolean contains(E e): 判断当前集合中是否包含给定的对象。
public boolean isEmpty(): 判断当前集合是否为空。
public int size(): 返回集合中元素的个数。
public Object[] toArray(): 把集合中的元素，存储到数组中。*/


public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("小李广");
        list.add("扫地僧");
        list.add("石破天");
        System.out.println(list);
        System.out.println("扫地僧是否在集合中:"+list.contains("扫地僧"));//判断扫地僧是否在集合中
        System.out.println("删除石破天了吗?"+list.remove("石破天"));
        System.out.println("删除之后的集合元素还有:"+list);
        System.out.println("集合中有"+list.size()+"个元素");

        String[] str=list.toArray(new String[list.size()]);//将集合转换成字符串数组

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }

        list.clear();//清空集合
        System.out.println(list.isEmpty());//判断集合是否为空
    }
}
