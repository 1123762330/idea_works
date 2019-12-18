package demo;

import java.util.List;

public class TryCatchDemo {
    public static void main(String[] args) {
        method();
        method2();
    }
    //多次捕获,多次处理

    //一次捕获,一次处理
    private static void method2() {
            try {
                int[] num={1,2,3};
                System.out.println(num[3]);
                List<Integer> list =List.of(1,2,3);
                System.out.println(list.get(3));
            }catch (Exception e){
                System.out.println(e);
            }
    }

    //  一次捕获,多次处理
    private static void method() {
        try {
            int[] num={1,2,3};
            //System.out.println(num[3]);
            List<Integer> list =List.of(1,2,3);
            System.out.println(list.get(3));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
}
