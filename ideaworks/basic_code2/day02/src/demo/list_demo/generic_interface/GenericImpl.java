package demo.list_demo.generic_interface;

public class GenericImpl implements Generic<String> {
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
