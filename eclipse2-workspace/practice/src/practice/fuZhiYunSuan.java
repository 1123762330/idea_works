package practice;

public class fuZhiYunSuan {

	public static void main(String[] args) {
		int a = 0 ; 
		System.out.println((++a) + (a) - (a) + (++a) - (--a) + (a++));


		                 //1+1-2+1-0+2=3
		                   /*
		                                                        ��һ��++a�����a=1;
                                                                             ������1+1=2��Ȼ�󸳸�a=2��
                             2-2=0;a��ֵ�ֱ�Ϊ0��Ҳ����˵���ڶ���++a֮ǰa��ֵû�б仯��
                                                                             ͬ������൱��1-0+2=3�����һ�����ʽa++=2��a�����¸�ֵΪ2��
                                                                             ���Ե�һ��������3��
                                                                              �ڶ������2��
                              a++;  a=a+1(a����a��Ȼ���1��
                              ++a;  a+1=a��a+1,��ֵ��a��                                               
		                   */
		System.out.println(a);
	}

}
