package practice;

import java.util.Random;
import java.util.Scanner;

public class NumberDemo {
	public static void main(String[] args){
		//产生一个0-100的随机数
		Random ran=new Random();
		int num=ran.nextInt(100)+1;
		//System.out.println(num);//后门
		System.out.println("请输入你猜的数字:");
		Scanner sc=new Scanner(System.in);
		while(true){	
			int i=sc.nextInt();//键入猜测的数字
			if(i>num){
				System.out.println("你猜大了");
			}else if(i<num){
				System.out.println("你猜小了");
			}else{
				System.out.println("你猜中了");	
				break;
			}		
		}
		
	}

}
