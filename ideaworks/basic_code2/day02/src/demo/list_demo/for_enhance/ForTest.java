package demo.list_demo.for_enhance;

import java.util.ArrayList;

public class ForTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("大白");
        list.add("小白");
        list.add("二白");
        for (String s:list) {
            System.out.print(s+" ");
        }

    }
}
