package cn.day03.demo.practice;

public class Demo1 {
    /*
    	1.根据工龄(整数)给员工涨工资(整数),工龄和基本工资通过定义int类型变量给出
	2.涨工资的条件如下：
		[10-15)     +5000
		[5-10)      +2500
		[3~5)       +1000
		[1~3)       +500
		[0~1)       +200
	3.最终效果:
		如果工龄为10，基本工资为3000
		程序运行后打印格式
		"您目前工作了10年，基本工资为 3000元, 应涨工资 5000元,涨后工资 8000元"
     */
    public static void main(String[] args) {
        //1.先去判断工龄是否合法
        int workAge = 15;
        if(workAge < 0 || workAge >= 15){
            System.out.println("工龄不合法");
        }else {//合法的工龄
            int yzg;
            if(workAge >= 10 && workAge < 15) {
                yzg = 5000;
            }else  if(workAge >= 5 && workAge < 10){
                yzg = 2500;
            }else  if(workAge >= 3 && workAge < 5){
                yzg = 1000;
            }else  if(workAge >= 1 && workAge < 3){
                yzg = 500;
            }else {
                yzg = 200;
            }
            System.out.println("您目前工作了"+workAge+"年，基本工资为 3000元, 应涨工资 "+yzg+"元,涨后工资 "+(yzg+3000)+"元");
        }
    }
}
