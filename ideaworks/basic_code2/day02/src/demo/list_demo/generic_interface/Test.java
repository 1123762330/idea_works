package demo.list_demo.generic_interface;

public class Test {
    public static void main(String[] args) {
        GenericImpl gc = new GenericImpl();
        gc.method("这是第一种实现类方法");

        GenericImpl2<Integer> impl2 = new GenericImpl2<>();
        impl2.method(1001);//这是整型

        GenericImpl2<String> imp = new GenericImpl2<>();
        imp.method("王老吉");//这是跟着字符串型
    }
}
