package practice;

import java.util.Random;
import java.util.Scanner;

public class NumberDemo {
	public static void main(String[] args){
		//����һ��0-100�������
		Random ran=new Random();
		int num=ran.nextInt(100)+1;
		//System.out.println(num);//����
		System.out.println("��������µ�����:");
		Scanner sc=new Scanner(System.in);
		while(true){	
			int i=sc.nextInt();//����²������
			if(i>num){
				System.out.println("��´���");
			}else if(i<num){
				System.out.println("���С��");
			}else{
				System.out.println("�������");	
				break;
			}		
		}
		
	}

}
