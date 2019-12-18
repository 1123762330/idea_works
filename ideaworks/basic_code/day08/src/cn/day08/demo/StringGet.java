package cn.day08.demo;
//String中与获取相关的常用方法和截取字符串方法
public class StringGet {
    public static void main(String[] args) {
        //创建字符串对象
        String s="hello23545world";
        System.out.println("字符串的长度为:"+s.length());//获取字符串长度,也就是字符个数length()
        String s1=s.concat("one");//连接其他字符,变成新的对象concat
        System.out.println("连接后产生的新字符串是:"+s1);
        System.out.println("===========");
        System.out.println("指定5索引处的字符是:"+s.charAt(5));//获取指定索引处的字符
        System.out.println("h第一次出现的索引位置是:"+s.indexOf("h"));//获取某个字符在字符串中第一次出现的索引,没有就返回-1
        System.out.println("字符串中是否有h字符:"+s.contains("6"));
        System.out.println("================");
        System.out.println("从索引6到终止索引字符:"+s.substring(6));////从索引起截取字符串到结尾,从索引6-结束索引的位置
        System.out.println("从起始索引到终止索引的字符:"+s.substring(0,7));////截取指定索引中间的字符串,[0,7)左闭右开区间
    }
}
