package practice;

public class shuZu {
	public static void main(String[] args){
		float a=98;
		float b=67;
		float c=89;
		float e=56;
		//��һ��д��
		float[] fenshu=new float[10];
		fenshu[0]=a;
		fenshu[1]=b;
		fenshu[2]=c;
		fenshu[3]=e;
		
		//�ڶ���д��
		float[] fenshu2=new float[]{98,67,89,56};
		
		//������д��
		float[] fenshu3={98,67,89,56};
		System.out.println(fenshu[0]);
		
		//�������ܺ�
		float sum=0;
		            //i<����ĳ���
		for(int i=0;i<fenshu3.length;i++){
			sum=sum+fenshu[i];
		}
		System.out.println(sum);
		
		//������ƽ����
		float avg=0;
		avg=sum/fenshu3.length;
		System.out.println(avg);
		
		//�ַ�������
		String[] str=new String[]{"�Ű�","����","����","������"};
		
		//��������
		order order1=new order();
		order1.orderid="001";
		order1.orderment=97.0f;
		
		order order2=new order();
		order1.orderid="002";
		order1.orderment=67.0f;
		
		order[] orders1=new order[]{order1,order2};
	}

}
