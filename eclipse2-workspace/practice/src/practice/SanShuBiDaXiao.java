package practice;
import java.util.*;
public class SanShuBiDaXiao
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in); //利用键盘输入功能
System.out.print("a=");
int a = input.nextInt() ; //输入数字a 只能为int类型
System.out.print("b=");
int b = input.nextInt() ;
System.out.print("c=");
int c = input.nextInt() ;
SanShuBiDaXiao e = new SanShuBiDaXiao() ;
e.sort(a,b,c);
}
void sort(int a,int b,int c)
{
int temp = 0 ;
if(a>b){
temp = a;
a = b ;
b = temp ;
}
if(a>c){
temp = a;
a = c ;
c = temp ;
}
if(b>c){
temp = b;
b = c ;
c = temp ;
}
System.out.println(a+","+b+","+c);
}
}