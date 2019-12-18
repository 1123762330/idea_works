package demo.list_demo.generic;

public class GenericDemo {
    public static void main(String[] args) {
        Generic<String> gc = new Generic<>("大明");//创建泛型对象,并赋值
        String name = gc.getName();//获取数据
        System.out.println(name);
    }
}
