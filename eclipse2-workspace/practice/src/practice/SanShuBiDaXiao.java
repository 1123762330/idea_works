package practice;
import java.util.*;
public class SanShuBiDaXiao
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in); //���ü������빦��
System.out.print("a=");
int a = input.nextInt() ; //��������a ֻ��Ϊint����
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