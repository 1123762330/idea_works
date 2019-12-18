package practice;

public class fangFa {
	public static void main(String[] args){
		float a=76.0f;
		float b=203.0f;
		double result;
		
		if(a<100){
			result=a*0.9;	
		}else if(a>=100&a<200){
			result=a*0.75;
		}else{
			result=a*0.6;
		}
		System.out.println(result);
		
		if(b<100){
			result=a*0.9;	
		}else if(b>=100&b<200){
			result=b*0.75;
		}else{
			result=b*0.6;
		}
		System.out.println(result);
	}

}
