package practice;
//��������
public class shuJuyunsuan {

	public static void main(String[] args) {
		int a=3;
		int b=10;
		int sum=a+b;
		int jian=a-b;
		int cheng=a*b;
		float shang=(float)a/b;//�����������С����������ת����float��������
		
		//��������,ֻ�����ֽ����true/false��
		boolean a1=true;
		boolean b1=false;
		boolean c=a1&b1;//a��b
		boolean d=a1|b1;//a��b
		System.out.println("a+b="+sum);
		System.out.println("a-b="+jian);
		System.out.println("a*b="+cheng);
		System.out.println("a/b="+shang);
		System.out.println("a&b="+c);
		System.out.println("a|b="+d);
	}

}

