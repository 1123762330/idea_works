package practice;
import java.util.Random;

public class RandomDemo {
	public static void main(String[] args){
		//����һ��random����
		Random ran=new Random();
		int i=ran.nextInt(10);//������һ��Ҫ������Χֵ
		Double d=ran.nextDouble();//С����Χֵ����1
		System.out.println("������ǣ�"+i);
		System.out.println("���С���ǣ�"+d);
	}

}
