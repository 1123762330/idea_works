package cn.test6;

import java.util.ArrayList;

public class Test6_1 {
    public static void main(String[] args) {
        String arr1[] = {"0af3s2sf", "s6ds1", "jjww", "lailai"};
        getList(arr1);
    }

    public static void getList(String[] arr1) {
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            list1.add(arr1[i]);
        }

        for (int i = arr1.length - 1; i >= 0; i--) {
            char[] ch = arr1[i].toCharArray();
            for (int i1 = ch.length - 1; i1 >= 0; i1--) {
                if ('0' <= ch[i1] && ch[i1] <= '9') {
                    list1.remove(i);
                    break;
                }
            }

        }
        System.out.println(list1);
    }
}
