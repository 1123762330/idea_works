package test1;
/*键盘录入一个字符串”2018-2-14”, 将字符串转换为日期对象, 再将日期对象转成日历对象,
求2018年2月14日是星期几,以及是这一年的第几天,最后获取当前日期,
将当前日期转换为字符串打印输出(如:今天是2018年09月13日),
并计算到2018年2月14日到当前日期隔了多少天.*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入格式日期:2018-2-14");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        //创建时间格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(s);
        System.out.println(date);

        //将日期对象转换成日历对象
        Calendar c = Calendar.getInstance();//创建日历对象
        c.setTime(date);//设置日期
        int year=c.get(Calendar.YEAR);//获取年份
        int month=c.get(Calendar.MONTH)+1;//获取月份,月份加1,才是中国人的日期
        int day=c.get(Calendar.DATE);//获取天
        String[] weeks={"天","一","二","三","四","五","六"};
        int week=c.get(Calendar.DAY_OF_WEEK)-1;//获取星期几
        int dayday=c.get(Calendar.DAY_OF_YEAR);//获取一年中的第几天
        System.out.println(+year+"年"+month+"月"+day+"日是星期"+weeks[week]+"是这一年中的第"+dayday+"天");

        // 最后获取当前日期
        Date date1 = new Date();
        //将当前日期转换成字符串
        //创建字符串格式日期
        SimpleDateFormat dateParse= new SimpleDateFormat("yyyy年MM月dd日");
        String format = dateParse.format(date1);
        System.out.println("今天是"+format);

        //计算到2018年2月14号隔了多少天
        long nowaTime = date1.getTime(); //当前日期毫秒值
        long dateTime = date.getTime();//将2018年2月14号转成毫秒值
        long time=nowaTime-dateTime;
        System.out.println("2018年2月14日到当前日期隔了"+time/1000/60/60/24+"天");
    }
}
