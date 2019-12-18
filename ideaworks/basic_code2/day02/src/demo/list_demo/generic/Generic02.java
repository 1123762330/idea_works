package demo.list_demo.generic;

public class Generic02 {
    public static void main(String[] args) {
        Generic02Method gc = new Generic02Method();
        gc.method("这是字符串类型");
        gc.method(10);
        gc.method(8.8);
        gc.method(true);

        gc.method2("这是静态泛型,不建议对象调用");
        Generic02Method.method2("这是静态泛型方法");//静态方法第二种方法:类.方法名

    }
}
