package cn.day08.demo;
//字符串转换功能及切割功能
public class StringConvert {
    public static void main(String[] args) {
        //首先创建字符串对象
        String s="abcdeabc";

        //将字符串转换为字符数组
        char[] chars=s.toCharArray();
        //遍历输出
        for(int i=0;i<chars.length;i++){
            System.out.print(chars[i]+" ");
        }
        System.out.println("============");

        //将字符串转换为字节数组
        byte[] b=s.getBytes();
        //遍历输出
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println("=============");

        //将指定字符替换成其他字符
        String replace=s.replace("abc","***");
        System.out.println(replace);

        //字符串分割
        String s2="abc,dHah,Fiush,adda ";
        //根据 , 进行分割,如果是根据 . 切割,那么需要使用 \\. 来使用
        String[] array=s2.split(",");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        String trim=s2.trim();//去除字符串前后的空格
        String max=s2.toUpperCase();//转大写
        String min=s2.toLowerCase();//转小写
        boolean flag=s2.startsWith("a");//判断字符串以什么开头
        boolean flag2=s2.endsWith("b");//判断字符串以为什么结尾

        System.out.println(trim);
        System.out.println(max);
        System.out.println(min);
        System.out.println(flag);
        System.out.println(flag2);
    }
}
