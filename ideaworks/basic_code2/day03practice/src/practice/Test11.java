package practice;

import java.util.LinkedHashSet;
import java.util.Scanner;

//键盘录入一个字符串，去掉其中重复字符，打印出不同的那些字符，必须保证顺序。
//例如输入：aaaabbbcccddd，打印结果为：abcd。
public class Test11 {
    public static void main(String[] args) {
        method();
    }

    private static void method() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=scanner.next();
        //将字符串转换成字符数组
        char[] chars=str.toCharArray();
        //创建不重复集合
        LinkedHashSet<Character> list = new LinkedHashSet<>();
        //遍历数组,将数据添加到集合中
        for (int i = 0; i < chars.length; i++) {
             list.add(chars[i]);
        }
        System.out.println(list);
    }
}
