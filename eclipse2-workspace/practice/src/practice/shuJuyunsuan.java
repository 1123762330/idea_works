package practice;
//数据运算
public class shuJuyunsuan {

	public static void main(String[] args) {
		int a=3;
		int b=10;
		int sum=a+b;
		int jian=a-b;
		int cheng=a*b;
		float shang=(float)a/b;//除法运算会有小数，所以先转化成float类型数据
		
		//布尔运算,只有两种结果（true/false）
		boolean a1=true;
		boolean b1=false;
		boolean c=a1&b1;//a与b
		boolean d=a1|b1;//a或b
		System.out.println("a+b="+sum);
		System.out.println("a-b="+jian);
		System.out.println("a*b="+cheng);
		System.out.println("a/b="+shang);
		System.out.println("a&b="+c);
		System.out.println("a|b="+d);
	}

}

