package demo.reflect;

//获取类名的三种方式
public class ClassGet {
    public static void main(String[] args) throws Exception {
        //加载全类名,多用于配置文件,加载,读取
        Class cls = Class.forName("demo.reflect.Person");
        System.out.println(cls);

        //类名.class,多用于参数传递
        Class cls2 = Person.class;
        System.out.println(cls2);

        //对象.getClass(),多用于对象获取字节码文件
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

    }
}
