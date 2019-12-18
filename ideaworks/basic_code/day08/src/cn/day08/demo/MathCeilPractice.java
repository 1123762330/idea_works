package cn.day08.demo;

public class MathCeilPractice {
    public static void main(String[] args) {
        //首先判断区间
        double min=-10.1;//定义最小值
        double max=5.9;//定义最大值
        int count=0;//定义次数
        for(int i=(int)min;i<max;i++){
            int abs=Math.abs(i);//进行绝对值转化
            if(abs>6 || abs<2.1){//进行区间判断
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("大于6或者小于2.1的绝对值有"+count);
    }
}
