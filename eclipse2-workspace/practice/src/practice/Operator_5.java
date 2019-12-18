package practice;
public class Operator_5{
	public static void main(String[] args){
		System.out.println(3>5?99:88);
		
		String s = 0==1?"込込":"最最";
		System.out.println(s);
		
		
		int a = 5;
		int b = 3;
		int c = 1;
		//         T  && T 
		int n2 = (a>b && b>c) ? (c++) : (++c);
		System.out.println(c);
		System.out.println(n2);
	}
}
