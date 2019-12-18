package practice;
//直角三角形
public class zhiJiaoSanJiao{
       public static void main(String[] args) {
          int x=1;//当外循环初始化循环条件值
            while(x<6){ //循环条件判断
                  int y=1;//内循环初始化条件
                     while(y<x){//内循环判断条件
                     System.out.print("*");//每次y++是为了在在内循环判断条件时能够跳出内循环，进而执行外循环
                     y++;
                     } 
                 x++;//是为了控制外循环打印的行数
                 System.out.println();//换行
             }
         
    	   for(int i=1;i<=6;i++){
    	   for(int j=1;j<=i;j++){
    			  System.out.print("*"+j);
    		   }
    	   System.out.println();
    	   }
       }
}