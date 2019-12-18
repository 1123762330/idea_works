package demo.Predicate;

import java.util.function.Predicate;

public class Predicate_and {
    public static void main(String[] args) {
        String s = "abcdef";
        boolean b = method(s, (String str) -> {
            return str.length() > 5;
        }, (String str) -> {
            return str.contains("a");
        });
        System.out.println(b);

    }

    private static boolean method(String s, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.and(pre2).test(s);
    }
}
