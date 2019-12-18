package demo.string_and_system;
//StringBuilder和String可以相互转换
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder().append("hello").append(12).append("world");//链式编程
        System.out.println("链式编程字符串:"+bu1);

        String s = "hello";
        System.out.println("s:"+s);

        StringBuilder bu = new StringBuilder(s);//将String转换成StringBuilder
        bu.append("world");
        System.out.println("bu:"+bu);

        String s2=bu.toString();//将StringBuilder转换成String
        System.out.println("s2:"+s2);
    }
}
