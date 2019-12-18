package demo.anonymityclass;

public class InterfaceTest {
    public static void main(String[] args) {
        Interface obj= new Interface() {
            @Override
            public void method() {
                System.out.println("这是匿名内部类");
            }
        };
        obj.method();//匿名内部类调用方法
    }
}
