package cn.day08.practice;
/*根据题意完成下面操作
        (1) 定义一个字符串"aaammssDJEjn"
        (2) 定义一个方法，将字符串传入其中，将字符串的首写字母变为大写，其余变成小写字母
        (3) 将返回的字符串在控制台上打印出来。*/
public class Test4 {
    public static void main(String[] args) {
        String str="aaammssDJEjn";
        System.out.println(stringMethod(str));;
    }

    public static String stringMethod(String str){
        String str1=str.substring(0,1);
        String str2=str1.toUpperCase();
        String str3=str.substring(1);
        String str4=str3.toLowerCase();
        String str5=str2+str4;
        return str5;
    }
}
