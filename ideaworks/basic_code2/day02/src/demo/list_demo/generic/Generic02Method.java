package demo.list_demo.generic;

public class Generic02Method {
    //创建一个泛型参数方法
    public<M> void method(M m){
        System.out.println(m);
    }

    //创建一个静态的泛型参数方法
    public static <S> void method2(S s){
        System.out.println(s);
    }
}
