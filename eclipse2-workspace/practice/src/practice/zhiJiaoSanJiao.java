package practice;
//ֱ��������
public class zhiJiaoSanJiao{
       public static void main(String[] args) {
          int x=1;//����ѭ����ʼ��ѭ������ֵ
            while(x<6){ //ѭ�������ж�
                  int y=1;//��ѭ����ʼ������
                     while(y<x){//��ѭ���ж�����
                     System.out.print("*");//ÿ��y++��Ϊ��������ѭ���ж�����ʱ�ܹ�������ѭ��������ִ����ѭ��
                     y++;
                     } 
                 x++;//��Ϊ�˿�����ѭ����ӡ������
                 System.out.println();//����
             }
         
    	   for(int i=1;i<=6;i++){
    	   for(int j=1;j<=i;j++){
    			  System.out.print("*"+j);
    		   }
    	   System.out.println();
    	   }
       }
}