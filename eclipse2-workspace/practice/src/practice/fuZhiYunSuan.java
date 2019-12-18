package practice;

public class fuZhiYunSuan {

	public static void main(String[] args) {
		int a = 0 ; 
		System.out.println((++a) + (a) - (a) + (++a) - (--a) + (a++));


		                 //1+1-2+1-0+2=3
		                   /*
		                                                        第一个++a结果是a=1;
                                                                             所以是1+1=2，然后赋给a=2；
                             2-2=0;a的值又变为0；也就是说，第二个++a之前a的值没有变化；
                                                                             同理，后边相当于1-0+2=3；最后一个表达式a++=2；a被重新赋值为2；
                                                                             所以第一个语句输出3；
                                                                              第二个输出2；
                              a++;  a=a+1(a等于a，然后加1）
                              ++a;  a+1=a（a+1,赋值给a）                                               
		                   */
		System.out.println(a);
	}

}
