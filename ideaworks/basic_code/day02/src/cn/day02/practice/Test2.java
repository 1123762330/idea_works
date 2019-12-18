package cn.day02.practice;
/*
1,定义一个变量int score = 成绩值;
	2.判断该学生成绩是否及格
	3.打印格式：
		成绩>=60:打印"合格"
		成绩<60: 打印"不合格"
	提示：
	可以使用 三元算术运算符实现
 */
public class Test2 {
        public static void main(String[] args){
            int score=70;
            String result=score>=60?"合格":"不合格";
            System.out.println(result);

            //第二种方法
            if(score>=60){
                System.out.println("合格");
            }else{
                System.out.println("不合格");
            }
        }
    }

