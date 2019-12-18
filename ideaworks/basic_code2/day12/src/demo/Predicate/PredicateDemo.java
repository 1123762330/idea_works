package demo.Predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        /*boolean b = method("abcde", (s) -> {
            return s.length() > 5;
        });*/

        //优化一下
        String str="abcde";
        boolean b = method(str, s -> s.length() > 5);
        System.out.println(b);
    }

    public static boolean method(String str, Predicate<String> pre) {
        return pre.test(str);
    }
}
