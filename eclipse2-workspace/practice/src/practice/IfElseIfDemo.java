package practice;

public class IfElseIfDemo {
	public static void main(String[] args){
		int a,b,c,temp;
		a=8;
		b=5;
		c=6;
        temp = 0 ;
        //���������е����ֵ
		if(a>b){
			System.out.println(a);
		}else if(a>c){
			System.out.println(a);
		}else if(b>c){
			System.out.println(b);
		}else{
			System.out.println(c);
		}
		
		//���������մ�С����
		if(a<b){
		temp = a;
		a = b ;
		b = temp ;
		}else if(a<c){
		temp = a;
		a = c ;
		c = temp ;
		}else if(b<c){
		temp = b;
		b = c ;
		c = temp ;
		}
		System.out.println(a+","+b+","+c);
	}

}
