package practice;

import java.util.Random;

public class CallNameDemo {
	public static void main(String[] args) {
	       //��������
	       String[] name=new String[6];
		   //��ȡ���ѧ������
		   addStudent(name);
		   //���ñ������鷽��
		   printStudent(name);
		   //���������������
		   String student=randomStudent(name);
		   System.out.println("������е�ѧ����:"+student);
	}
		
		//����������鷽��
		public static void printStudent(String[] name) {
			for(int i=0;i<name.length;i++) {
				System.out.println(name[i]);
			}
		}
		
		//����һ�����������,����������
		public static String randomStudent(String[] name) {
			Random ran=new Random();
			int index=ran.nextInt(name.length);
			return name[index];
		}
		
		//�������ѧ�����Ʒ���
		public static void addStudent(String[] name) {
			  name[0]="����";
			  name[1]="����";
			  name[2]="����";
			  name[3]="���";
			  name[4]="����";
			  name[5]="����";
		}
}
