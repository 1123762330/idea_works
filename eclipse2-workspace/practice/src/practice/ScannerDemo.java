package practice;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);//����һ������Scanner���Ӽ�����������
		System.out.println("�Ӽ�������һ�����֣�");
		int i=scan.nextInt();//nextInt�Ǽ���һ����������		
		System.out.println(i+1);
		
		System.out.println("�Ӽ�������һ��С����");
		double d=scan.nextDouble();//nextInt�Ǽ���һ��double����
		System.out.println(d);
		
		System.out.println("�Ӽ�������һ���ַ�����");
		String str=scan.next();//next�Ǽ���һ���ַ�������
		System.out.println(str);
	}

}
