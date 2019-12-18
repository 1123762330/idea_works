package cn.day03.demo.practice;
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
public class Test1 {
    public static void main(String[] args){
        int gongling =10;
        int gongzi=3000;
        int zhangxin=0;
        if (gongling>=0 && gongling <1){
            zhangxin=200;//定义涨薪
        }else if (gongling>=1 && gongling <3){
            zhangxin=500;
        }else if (gongling>=3 && gongling <5){
            zhangxin=1000;
        }else if (gongling>=5 && gongling <10){
            zhangxin=2500;
            gongzi+=zhangxin;
        }else if (gongling>=10 && gongling <15){
            zhangxin=5000;
        }else{
            System.out.println("输入的条件有误!!!");
        }
        gongzi=zhangxin+gongzi;
        System.out.println("您目前工作了"+gongling+"年，基本工资为 3000元, 应涨工资"+zhangxin+"元,涨后工资 "+gongzi+"元");
    }
}
