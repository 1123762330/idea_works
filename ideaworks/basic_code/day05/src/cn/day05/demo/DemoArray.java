package cn.day05.demo;
        //数组的三种写法
public class DemoArray {
    public static void main(String[] args) {
        //第一种方式 动态数组:首先指定长度
        int[] str=new int[3];
        str[0]=1;
        str[1]=2;
        str[2]=3;

        //第二种方式 静态初始化:顺带添加数据(标准格式)
        int[] str1=new int[]{1,2,3,4};

        //第三种方式 静态初始化(省略格式)
        int[] str2={1,2,3,4};
     }
}
