package cn.day03.demo;

public class Demo03Hours {
    public static void main(String[] args) {
        for(int hour=0;hour<24;hour++){//外层循环控制小时
            for(int minute=0;minute<60;minute++){//中层循环控制分钟
                for(int m=0;m<60;m++)//内层循环控制秒
                System.out.println(hour+"时"+minute+"分"+m+"秒");
            }
        }
    }
}
