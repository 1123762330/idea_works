package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*1.已知日期字符串:"2015-10-20",将改日期字符串转换为日期对象
2.将(1)中的日期对象转换为日历类的对象
3.根据日历对象获取该日期是星期几,以及这一年的第几天
4.通过键盘录入日期字符串，格式(2015-10-20)
如输入：2015-10-20，输出"2015年-10月-20日 是 星期二，是2015年的第 293 天"*/

public class Test1 {
    public static void main(String[] args) throws ParseException {
            demo1();
    }

    private static void demo1() throws ParseException {
        //键盘录入一个指定格式的字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请按照格式输入日期:(2015-10-20)");
        String dateString=sc.next();

        //Date date1 = sdf.parse("2015-01-00");
        /*String s = sdf.format(date);
        System.out.println(s);//将Date日期格式转换成文本格式日期*/

        //将字符串转成日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//创建文本日期对象
        Date date = sdf.parse(dateString);//将文本日期转成Date格式日期

        //将日期对象转成日历对象
        Calendar c = Calendar.getInstance();//创建日历对象
        c.setTime(date);//设置日期

        //获取年月日,星期和多少天
        int year=c.get(Calendar.YEAR);//获取年份
        int month=c.get(Calendar.MONTH)+1;//获取月份,月份加1,才是中国人的日期
        int day=c.get(Calendar.DATE);//获取天
        int week=c.get(Calendar.DAY_OF_WEEK)-1;//获取星期几
        int dayd=c.get(Calendar.DAY_OF_YEAR);//获取一年的第几天

        /*long time = date.getTime();//2015年10月20号的毫秒值
        long date1Time = date1.getTime();//2015年起始毫秒值
        long time2=time-date1Time;
        long daynum=(time2/1000/60/60/24);*/

        //通过数组转换成星期
        String[] weeks={"天","一","二","三","四","五","六"};
        System.out.println(year+"年-"+month+"月-"+day+"日"+"是"+"星期"+weeks[week]+ ",是2015年的第"+dayd+"天");
    }
}
