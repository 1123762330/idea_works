package demo.list_demo.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMethod {
    public static void main(String[] args) {
        demo1();//获取日历
        demo2();//设置日期日历
        demo3();//日历增加
        demo4();//获取Date格式的日历
    }

    private static void demo4() {
        Calendar c = Calendar.getInstance();//创建日历对象
        Date d=c.getTime();//获取当前的日历对象
        System.out.println(d);
    }

    private static void demo3() {
        Calendar c = Calendar.getInstance();//创建日期对象
        c.add(Calendar.YEAR,2);//年份+2年

        int year=c.get(Calendar.YEAR);//获取年份
        int month=c.get(Calendar.MONTH);//获取月份,月份加1,才是中国人的日期
        int day=c.get(Calendar.DATE);//获取天
        System.out.println(year+" "+month+" "+day);
    }

    private static void demo2() {
        Calendar c = Calendar.getInstance();//创建日期对象
        c.set(2018,9,9);//设置日期

        int year=c.get(Calendar.YEAR);//获取年份
        int month=c.get(Calendar.MONTH);//获取月份,月份加1,才是中国人的日期
        int day=c.get(Calendar.DATE);//获取天
        System.out.println(year+" "+month+" "+day);
    }

    private static void demo1() {
        Calendar c = Calendar.getInstance();//创建日期对象
        int year=c.get(Calendar.YEAR);//获取年份
        int month=c.get(Calendar.MONTH);//获取月份,月份加1,才是中国人的日期
        int day=c.get(Calendar.DATE);//获取天
        System.out.println(year+" "+month+" "+day);
    }
}
