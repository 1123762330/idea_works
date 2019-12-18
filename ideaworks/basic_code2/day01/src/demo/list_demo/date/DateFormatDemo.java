package demo.list_demo.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Date日期格式和文本日期格式互相转换

public class DateFormatDemo {              //避过这个异常
    public static void main(String[] args) throws ParseException {
        demo1();//将时间格式化为文本
        demo2();//将文本日期转换为时间格式
    }
                                //避过这个异常
    private static void demo2() throws ParseException {
        //创建时间格式化对象
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date =dateFormat.parse("1995年11月14日 10时12分11秒");
        System.out.println(date);
    }

    private static void demo1() {
        //创建SimpleDateFormat对象,构造方法中传递指定的模式
        SimpleDateFormat dateParse= new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();//创建时间格式对象
        String d = dateParse.format(date);//将系统日期转换成字符串,文本模式对象调用format方法转换系统时间
        System.out.println(date);//输出系统时间
        System.out.println(d);//输出指定字符串格式日期
    }
}
