package student;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CallName {
	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		addStudent(list);//添加学生到数组中
		printStudent(list);//打印
		randomStudent(list);//随机抽出一名学生
	}
    //定义一个随机数方法
	public static void randomStudent(ArrayList<Student> list) {
		Random ran=new  Random();
		int index=ran.nextInt(list.size());
		Student sj=list.get(index);
		System.out.println("抽中的学生姓名是:"+sj.name+" 年龄:"+sj.age);
		
	}
    //添加学生信息
	public static void addStudent(ArrayList<Student> list) {
		System.out.println("请添加学生信息:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++){
			Student s1=new Student();
			s1.name=sc.next();
			s1.age=sc.nextInt();
			list.add(s1);
		}
		
		
	}
	//遍历数组并打印出来
	public static void printStudent(ArrayList<Student> list) {
		for(int i=0;i<list.size();i++){
			Student s1=list.get(i);
			System.out.println("学生姓名:"+s1.name+" 年龄:"+s1.age);
		}
		
	}

}
