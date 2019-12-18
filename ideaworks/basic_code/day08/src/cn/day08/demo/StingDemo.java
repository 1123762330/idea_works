package cn.day08.demo;

public class StingDemo {
    public static void main(String[] args) {
        //字符串拼接
        String str="abc";
        str+="d";
        System.out.println("str = " + str);

        String str1=new String();//无参构造

        char[] chars={'a','b','c'};//字符数组创建
        String str2=new String(chars);

        byte[] bytes={97,98,99,109};//字节数组创建
        String str3=new String(bytes);

        String str4="hello";//直接创建

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

/*        //通过重载方式
        String str5=new String(bytes,90,99);
        System.out.println(str5);*/
    }
}
