package practice;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);//创建一个变量Scanner，从键盘输入数字
		System.out.println("从键盘输入一个数字：");
		int i=scan.nextInt();//nextInt是键入一个整数数据		
		System.out.println(i+1);
		
		System.out.println("从键盘输入一个小数：");
		double d=scan.nextDouble();//nextInt是键入一个double数据
		System.out.println(d);
		
		System.out.println("从键盘输入一个字符串：");
		String str=scan.next();//next是键入一个字符串数据
		System.out.println(str);
	}

}
