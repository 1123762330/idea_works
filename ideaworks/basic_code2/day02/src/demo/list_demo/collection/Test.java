package demo.list_demo.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        coll.add("天安门");
        coll.add("兵马俑");
        Iterator<String> it = coll.iterator();
        System.out.print(it.next());
        System.out.print(it.next());
        System.out.print(it.next());
    }
}
