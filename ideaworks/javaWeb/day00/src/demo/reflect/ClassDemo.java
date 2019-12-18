package demo.reflect;
import java.lang.reflect.Field;

//class对象获取方法
public class ClassDemo {
    public static void main(String[] args) throws Exception {
        //获取class对象
        Class cls2 = Person.class;

        //获取所有public修饰的成员变量
        Field[] fields = cls2.getFields();
        //获取所有成员变量
        Field[] fields1 = cls2.getDeclaredFields();
        //获取指定的成员变量
        Field field = cls2.getField("sex");

        //遍历显示结果
        for (Field f : fields) {
            System.out.println("public修饰的"+f);
        }

        for (Field fiel : fields1) {
            System.out.println("所有的成员变量"+fiel);
        }

        Person p = new Person();
        //实例化对象,等同于上面的创建对象
        Object obj = cls2.newInstance();

        //赋值或者取值
        field.set(p,"男");//设置值
        Object value = field.get(p);//获取值
        System.out.println(value);

    }
}
