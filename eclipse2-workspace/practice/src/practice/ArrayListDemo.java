package practice;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args){
		String[] str=new String[3];
		str[0]="ƻ��";
		str[1]="�㽶";
		str[2]="����";
		
		//����������������������������ArrayList
		ArrayList<String>  gouwuche=new ArrayList<String>();
		//��������
		gouwuche.add("ƻ��");
		gouwuche.add("�㽶");
		gouwuche.add("����");
		gouwuche.add("â��");
		System.out.println(gouwuche);
		
		//ɾ������
		gouwuche.remove(3);
		System.out.println(gouwuche);
		
		//�޸�����
		gouwuche.set(0,"apple");
		System.out.println(gouwuche);
		
		//ȡ������
		String tem=gouwuche.get(0);
		System.out.println(tem);
		
		//ȡ����������
		for(int i=0;i<gouwuche.size();i++){
			System.out.println(gouwuche.get(i));
		}
	}

}
