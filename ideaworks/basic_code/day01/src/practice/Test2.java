package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*1.从键盘录入一个日期字符串,格式为 xxxx-xx-xx,代表该人的出生日期
2.利用人出生日期到当前日期所经过的毫秒值计算出这个人活了多少天*/
public class Test2 {
    public static void main(String[] args) throws ParseException {
        demo();
    }

    private static void demo() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生日期,格式为xxxx-xx-xx");
        String dateString=sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//创建日期对象
        Date date = sdf.parse(dateString);//将文本格式日期转成Date格式
        long time = date.getTime();//将Date日期转成毫秒值
        long nowaTime = new Date().getTime();//此时此刻的毫秒值
        long time3 = nowaTime - time;
        long day=time3/1000/60/60/24;
        System.out.println("这个人活了"+day);
    }

}
