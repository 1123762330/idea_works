package demo.Test;

import java.util.function.Function;

public class Test2 {
    public static void main(String[] args) {
        //定义一个字符串
        String s="周凌云,20";
        //调用change方法
        int num = change(s, (str) -> {
            return str.split(",")[1];//将字符串进行切割,获取20
        }, (str) -> {
            return Integer.parseInt(str);//将20字符串转换成int类型
        }, (i) -> {
            return i + 100;
        });

        System.out.println(num);//输出这个结果
    }

    private static int change(String s, Function<String,String> fun1,Function<String,Integer> fun2,
                              Function<Integer,Integer> fun3) {
        return fun1.andThen(fun2).andThen(fun3).apply(s);
    }
}
