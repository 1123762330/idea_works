package practice;

import java.util.Random;

public class CallName {
	public static void main(String[] args) {
		//������Ա����
		String[] str= {"����","����","����","���","����","����","����","С��"};
		//��������
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);//�����Ա����
		}
		//����һ�������,��Ϊ�±�����
		Random ran= new Random();
		//������Χ��0-���鳤�ȵķ�Χ�����
		int index=ran.nextInt(str.length);
		System.out.println("���е�����:"+str[index]);
	}

}
