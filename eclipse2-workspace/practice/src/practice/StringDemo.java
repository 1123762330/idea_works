package practice;

public class StringDemo {
	public static void main(String[] args){
		//�ַ�����������
		String str1=new String("zhangsan,lisi,Wangwu,DEMO");
		String str2=("zhangsan,lisi,Wangwu,DEMO");
		
		//�ַ����и�
	    String[] spl=str1.split(",");
		for(int i=0;i<spl.length;i++){
		System.out.println(spl[i]);
		}
		
		//�ַ����ĳ���
		System.out.println(str1.length());
		
		//�ж������ַ����Ƿ����
		boolean equal=str1.equals(str2);
		System.out.println(equal);
		System.out.println(str1.equals("abc"));
		
		//���ַ�����Сдת��
		String upper=str1.toUpperCase();
		String upper2=str1.toLowerCase();
		System.out.println(upper);
		System.out.println(upper2);
		
		//�ж��ַ�����ʼ�ַ�
		boolean star=str1.startsWith("z");
		System.out.println(star);
		
		//�ж��ַ�����ֹ�ַ�
		boolean end=str1.endsWith("dd");
		System.out.println(end);
		
		//�ַ�����ȡ  ��ʼ�ű����ֹ�ű�
		String aa=str1.substring(0,6);
		System.out.println(aa);
		
		
	} 

}
