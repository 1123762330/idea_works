package practice;

import java.util.Scanner;
//��������
public class KuCunDemo {
	public static void main(String[] args) {
		//����ϵͳ�˵�
		caiDan();
		//�����Ա����
		String[] name={"����","��Ϊ","��˶"};//����������������
		double[] size={11,14,15.5};//���Գߴ��С
		double[] prices={2900,3200,4500};//��������ۼ۽��
		int[] count={10,6,7};//��������
		
		//���ܰ�ťѡ��
		while(true){
		   int choose=chooseFunction();
		     switch(choose){
		        case 1:
                  printFunction(name,size,prices,count);
			    break;
	            case 2:
	            	updateFunction(name,count);
		        break;
		        case 3:
			      exit();
		        break;
		        default:
		    	  System.out.println("����������ֲ�����");
		        break;
		     }
	      }
	  }
	//����һ���˵����淽��
	public static void caiDan(){
		System.out.println("*************������ϵͳ*************");
		System.out.println("1.�鿴����嵥");
		System.out.println("2.�޸���Ʒ����");
		System.out.println("3.�˳�ϵͳ");
		System.out.println("���������ָ��:");
	}
	
	//����һ��ѡ�񷽷�,����ѡ����Ӧ�Ĺ���
	public static int chooseFunction(){
		Scanner scan=new Scanner(System.in);
		  int i=scan.nextInt();
		     return i;
	}
	
	//����һ���������ķ���
	public static void printFunction(String[] name,double[] size,double[] prices,int[] count){
		System.out.println("------------����嵥------------");
		for(int j=0;j<name.length;j++){
			System.out.println("Ʒ��:"+name[j]+" �ߴ�:"+size[j]+" �ۼ�:"+prices[j]+" �������:"+count[j]);
		}
		
	}
	
	//����һ���޸���������
	public static void updateFunction(String[] name,int[] count){
		System.out.println("------------�޸���Ʒ�������-----------");
		Scanner sc=new Scanner(System.in);
		  int x=sc.nextInt();//�Ӽ��������±�鿴ĳ̨���Ե�ԭʼ�����
		  System.out.println("Ʒ��:"+name[x]+" �������:"+count[x]);//���ԭʼ�����
		  int c=sc.nextInt();//����Ҫ�޸ĵ�����
		  count[x] = c;//�޸��±�Ϊx�ĵ��ԵĿ������
		  System.out.println("Ʒ��:"+name[x]+" �޸ĺ�Ŀ������:"+count[x]);//����޸ĺ��ֵ
		  //name.set(x,"����");
				
	}
	
	//����һ���˳�����
	public static void exit(){
		System.out.println("------------�˳�ϵͳ����------------");
		System.out.println("�����˳�ϵͳ");
	}
}
