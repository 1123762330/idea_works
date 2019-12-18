package cn.day02.practice;
/*
    定义一个变量它的值是一个三位数,比如int num = 456;
	请把这个变量上的个位  十位  百位 分别取出来并且打印到控制台上
	提示:
    用除法和取余
 */
public class Test4 {
    public static void main(String[] args){
        int num=456;
        int bai=num/100%10;
        int shi=num/10%10;
        int ge=num%10;
        System.out.println("百位是:"+bai+"\r\n"+"十位是:"+shi+"\r\n"+"个位是:"+ge);
    }
}
