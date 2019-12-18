package cn.itheima.test2;

import java.util.Random;

//获取一个10到100之间(包含10和100)的随机数n,利用循环求出2到n之间(包含2和n)偶数的个数,并打印到控制台
public class Test2 {
    public static void main(String[] args) {
        Random ran=new Random();//创建随机对象
        int n=ran.nextInt(91)+10;
        int count=0;//定义个数
        System.out.println("随机数:"+n);
        for (int i=2;i<n;i++){
            if(i%2==0){
                count++;
                System.out.print(i+" ");//输出具体的偶数
            }
        }
        System.out.println();
        System.out.println(count);//输出次数
    }
}
