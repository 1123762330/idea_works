package student;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CallName {
	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		addStudent(list);//���ѧ����������
		printStudent(list);//��ӡ
		randomStudent(list);//������һ��ѧ��
	}
    //����һ�����������
	public static void randomStudent(ArrayList<Student> list) {
		Random ran=new  Random();
		int index=ran.nextInt(list.size());
		Student sj=list.get(index);
		System.out.println("���е�ѧ��������:"+sj.name+" ����:"+sj.age);
		
	}
    //���ѧ����Ϣ
	public static void addStudent(ArrayList<Student> list) {
		System.out.println("�����ѧ����Ϣ:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++){
			Student s1=new Student();
			s1.name=sc.next();
			s1.age=sc.nextInt();
			list.add(s1);
		}
		
		
	}
	//�������鲢��ӡ����
	public static void printStudent(ArrayList<Student> list) {
		for(int i=0;i<list.size();i++){
			Student s1=list.get(i);
			System.out.println("ѧ������:"+s1.name+" ����:"+s1.age);
		}
		
	}

}
