package practice;

public class fangFaTiaoYong {
    public static void main(String[] args){
    	float a=75.0f;
    	float b=120.0f;
    	float c=300.0f;
    	double aresult=getResult(a);
    	double bresult=getResult(b);
    	double cresult=getResult(c);
    	System.out.println("a���ۿۼ�"+aresult);
    	System.out.println("b���ۿۼ�"+bresult);
    	System.out.println("b���ۿۼ�"+cresult);
    	
    }
     //public static �������� ������������ı������ݣ�            
    public static double getResult(float yuanjinE){
    	double disresult;//������������
    	if(yuanjinE<100){
    		disresult=yuanjinE*0.9;
    	}else if(yuanjinE>100 & yuanjinE<200){
    		disresult=yuanjinE*0.8;
    	}else{
    		disresult=yuanjinE*0.7;
    	}
    	return disresult;//���ؽ��ֵ
    }

}