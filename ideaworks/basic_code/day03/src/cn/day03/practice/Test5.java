package cn.day03.demo.practice;
/*
(1)定义一个整数代表月份,范围1-12
	(2)输出该月份对应的季节
		3,4,5春季
		6,7,8夏季
		9,10,11秋季
		12,1,2冬季
	(3)演示格式如下:
		定义的一个月份是3
		控制台输出:3月份是春季
 */
public class Test5 {
    public static void main(String[] args){
        int num=1;
        if(num>=3 && num<=5){
            System.out.println(num+"月份是春季");
        }else if(num>=6 && num<=8){
            System.out.println(num+"月份是夏季");
        }else if(num>=9 && num<=11){
            System.out.println(num+"月份是秋季");
        }else if(num>=12 || num<=2 && num!=0){
            System.out.println(num+"月份是冬季");
        }else {
            System.out.println("月份输入有误");
        }
    }
}