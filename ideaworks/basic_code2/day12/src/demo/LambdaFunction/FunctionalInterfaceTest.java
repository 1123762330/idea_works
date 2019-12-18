package demo.LambdaFunction;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        //第一种,使用接口实现类
        show(new MyFunctionalInterfaceImpl());

        //第二种,使用匿名内部类
        show(new MyFunctionInterface() {
            @Override
            public void method() {
                System.out.println("第一种");
            }
        });

        //第三种,使用Lambda表达式
        show(()->{
            System.out.println("使用Lambda表达式重写接口中的抽象方法");
        });

        //简化Lambda表达式
        show(()-> System.out.println("使用Lambda表达式重写接口中的抽象方法"));
    }

    private static void show(MyFunctionInterface inter) {
        inter.method();
    }
}
