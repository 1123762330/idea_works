package kucun;

import java.util.ArrayList;
import java.util.Scanner;

public class KuCunFunction {
	// �����Ʒ����
	// �鿴ȫ����Ʒ����
	// �޸Ŀ����������
	// �h����Ʒ����
	// �˳�ϵͳ����
	// ����һ��ϵͳ�˵�
	// ����һ��ѡ���ܷ���
	public static ArrayList<KunCun> list = new ArrayList<KunCun>();// ���������洢����

	// ���������Ʒ�ķ���
	public static void addShangPin(ArrayList<KunCun> list) {
		System.out.println("--------------��������Ʒ��Ϣ--------------");
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < 3; i++) {
			KunCun shangpin = new KunCun();// newһ����Ʒ����
			System.out.print("�������" + i + "̨���Ե�����:");
			shangpin.name = sc.next();
			System.out.print("�������" + i + "̨���Եĳߴ��С:");
			shangpin.sizes = sc.nextDouble();
			System.out.print("�������" + i + "̨���Ե��ۼ�:");
			shangpin.prices = sc.nextDouble();
			System.out.print("�������" + i + "̨���Ե�����:");
			shangpin.count = sc.nextInt();
			list.add(shangpin);// �����Ʒ���洢������ȥ
		}
		System.out.println("��Ʒ��ӳɹ�,�����ѡ����������");
	}

	// ������������嵥
	public static void printStore(ArrayList<KunCun> list) {
		System.out.println("--------------��Ʒ����嵥--------------");
		for (int i = 0; i < list.size(); i++) {
			// ��ȡ��Ʒ��Ϣ
			KunCun shangpin = list.get(i);
			System.out.print("��������:" + shangpin.name + " ���Գߴ�:"
					+ shangpin.sizes);
			System.out.println(" �����ۼ�:" + shangpin.prices + " ��������:"
					+ shangpin.count);
		}
		System.out.println("������Ʒ��������,�����ѡ����������");
	}

	// �޸���Ʒ��淽��
	public static void update(ArrayList<KunCun> list) {
		System.out.println("------------�޸���Ʒ�������-----------");
		System.out.println("��������Ҫ�޸ĵĵ�����Ϣ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();// �Ӽ��������±�鿴ĳ̨���Ե�ԭʼ�����
		KunCun shangpin = list.get(x);// ��ȡ����е�x�±�ĵ�����Ϣ
		System.out.print("��������:" + shangpin.name + " ���Գߴ�:" + shangpin.sizes);// ���Ҫ�޸ĵĵ�����Ϣ
		System.out.println(" �����ۼ�:" + shangpin.prices + " ��������:"
				+ shangpin.count);// ���Ҫ�޸ĵĵ�����Ϣ
		shangpin.count = sc.nextInt();// ����Ҫ�޸ĵ�����
		int xin = shangpin.count;// ����һ���µı�����Ϊ�޸ĺ������
		System.out.println(xin);// ����޸ĺ������
		System.out.println("��Ʒ�޸ĳɹ�,�����ѡ����������");
	}
	
	// �h����Ʒ��淽��
	public static void delShangPin(ArrayList<KunCun> list) {
		System.out.println("------------�h����Ʒ-----------");
		System.out.print("��������Ҫ�h���ĵ��Ա��:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();// �Ӽ�������ĳ̨���Ե��±�
		list.remove(x);// ɾ������е�x�±�ĵ�����Ϣ
		System.out.println("��Ʒ�h���ɹ�,�����ѡ����������");
	}

	// �˳�ϵͳ
	public static void exit() {
		System.out.println("--------------�˳�ϵͳ����----------------");
		System.out.println("���Ѿ��˳�ϵͳ��!");
	}

	// ����һ��ϵͳ�˵�
	public static void caiDan() {
		System.out.println("--------------��Ʒ������ϵͳ----------------");
		System.out.println("1.�����Ʒ");
		System.out.println("2.�鿴����嵥");
		System.out.println("3.�޸Ŀ������");
		System.out.println("4.ɾ����Ʒ");
		System.out.println("5.�˳�ϵͳ");
	}

	// ����һ��ѡ���ܷ���
	public static int chooseFunction() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}

}
