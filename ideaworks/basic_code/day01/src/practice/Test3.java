package practice;

import java.util.Calendar;
import java.util.Date;

/*要求:利用Calendar类的方法判断当前年是闰年还是平年
        提示:
        闰年:二月有29天
        将日期设置为3月1号,然后倒退1天至2月底,求出2月底是多少天*/
public class Test3 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//创建日历对象
        int year = c.get(Calendar.YEAR);//获取系统当前的年份
        if(year%4==0){
            System.out.println(year+"是闰年");
        }else{
            System.out.println(year+"是平年");
        }

        Date date = new Date();
        c.setTime(date);
        c.set(Calendar.MONTH,2);//设置月份为2月份
        c.set(Calendar.DATE,1);//设置日期为1号
        c.add(Calendar.DATE,-1);//日期倒退一天
        int day=c.get(Calendar.DATE);//获取天数
        System.out.println(day);

    }
}
