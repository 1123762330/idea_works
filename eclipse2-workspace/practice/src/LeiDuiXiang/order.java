package LeiDuiXiang;

public class order {
       String order_id;
       double order_jiage;
       private  double order_zhekoujia;//�����˽���ֻ࣬����������ʹ��
       
       //���췽��   ������������ٸ�ֵ
       public order(String id,double jiage){
    	   this.order_id=id;
    	   this.order_jiage=jiage;
    	   this.order_zhekoujia=setCalpaymen();//�ۿ۽��ֱ�ӵ��ü��㷽��
       }
       
       public void setzheKouJia(){
    	   //this.order_zhekoujia=this.order_jiage*0.9;
    	   double payment=setCalpaymen();
    	   this.order_zhekoujia=payment;
       }
       public String getOrder_Id(){
    	   return order_id;  //����order��id
       }
       private double setCalpaymen(){
    	   return this.order_jiage*0.9;//�����ܽ��ķ���,ֻ����������ʹ��
       }
       
       public double getZongJinE(){
    	   return order_zhekoujia;     //�����ۿۺ���ܽ��
       }
}
