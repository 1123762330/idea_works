package cn.day07.demo;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args){
        //产生一个0-100的随机数
        Random ran=new Random();
        int num=ran.nextInt(100)+1;
        //System.out.println(num);//后门
        System.out.println("请输入你猜的数字:");
        Scanner sc=new Scanner(System.in);
        int count=0;
        while (true){
            //只给三次机会,没猜中游戏结束
            count++;
            if(count>3){
                break;
            }

            int s=sc.nextInt();//键入猜测的数字
            if(s>num){
                System.out.println("你猜大了,你还有"+(3-count)+"次机会");
            }else if(s<num){
                System.out.println("你猜小了,你还有"+(3-count)+"次机会");
            }else{
                System.out.println("你猜中了");
                break;
            }
        }

        System.out.println("机会已经用完,游戏结束");
    }

}
