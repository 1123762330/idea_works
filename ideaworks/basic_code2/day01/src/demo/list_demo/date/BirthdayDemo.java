package demo.list_demo.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//计算从你出生到现在过了多少天
public class BirthdayDemo {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生日期,格式为:yyyy-MM-dd");
        String birthday=sc.next();
        SimpleDateFormat stringDate = new SimpleDateFormat("yyyy-MM-dd");//创建文本格式日期对象
        Date birthdayDate = stringDate.parse(birthday);//将文本日期转成Date日期格式
        long birthdayTime = birthdayDate.getTime();//把Date格式的出生日期转换为毫秒值
        long nowaday = new Date().getTime();//获取当前的日期,转换为毫秒值
        long time3 = nowaday-birthdayTime;//使用当前日期的毫秒值-出生日期的毫秒值
        System.out.println(time3/1000/60/60/24); //把毫秒差值转换为天(s/1000/60/60/24)
    }
}
