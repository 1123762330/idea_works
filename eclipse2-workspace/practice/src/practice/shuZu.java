package practice;

public class shuZu {
	public static void main(String[] args){
		float a=98;
		float b=67;
		float c=89;
		float e=56;
		//第一种写法
		float[] fenshu=new float[10];
		fenshu[0]=a;
		fenshu[1]=b;
		fenshu[2]=c;
		fenshu[3]=e;
		
		//第二种写法
		float[] fenshu2=new float[]{98,67,89,56};
		
		//第三种写法
		float[] fenshu3={98,67,89,56};
		System.out.println(fenshu[0]);
		
		//求数组总和
		float sum=0;
		            //i<数组的长度
		for(int i=0;i<fenshu3.length;i++){
			sum=sum+fenshu[i];
		}
		System.out.println(sum);
		
		//求数组平均分
		float avg=0;
		avg=sum/fenshu3.length;
		System.out.println(avg);
		
		//字符串数组
		String[] str=new String[]{"张安","李三","王五","刘安琪"};
		
		//订单数组
		order order1=new order();
		order1.orderid="001";
		order1.orderment=97.0f;
		
		order order2=new order();
		order1.orderid="002";
		order1.orderment=67.0f;
		
		order[] orders1=new order[]{order1,order2};
	}

}
