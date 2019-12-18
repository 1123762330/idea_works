package cn.day08.demo;

public class StringDemo {
    public static void main(String[] args) {
        String str="hello";//创建字符串
        System.out.println(str);//输出显示结果
        str=change(str);//直接调用change方法
        System.out.println(str);//输出结果
    }

    public static String change(String str){
        str+="world";//字符串拼接
        return str;

    }
}
