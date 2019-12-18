package cn.day08.demo;
//比较内容是否相同
public class DemoStringEquals {
    public static void main(String[] args) {
        //创建字符串对象
        String s1="hello";
        String s2="hello";
        char[] charArray={'H','e','l','l','o'};
        String s3=new String(charArray);

        //比较对象是否相同
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//false
        System.out.println(s2.equals("hello"));//true

        //比较对象内容是否是一样,忽略大小写
        System.out.println(s1.equalsIgnoreCase(s3));//true
        System.out.println("Hello".equalsIgnoreCase(s3));//true
    }
}
