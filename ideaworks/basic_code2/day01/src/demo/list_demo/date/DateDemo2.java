package demo.list_demo.date;
import java.util.Date;
public class DateDemo2 {
    public static void main(String[] args) {
        //date1();
        //date2();
        date3();

    }
    public static void date3(){//常用的方法
        Date date = new Date();
        long time = date.getTime();//把日期转换成毫秒值
        System.out.println(time);
    }

    public static void date2(){//参数构造
        Date date = new Date(0L);//时间原点
        System.out.println(date);

        Date date2 = new Date(1536461249961L);//系统时间到时间原点的毫秒数
        System.out.println(date2);

    }

    public static void date1(){//空参构造
        Date date = new Date();
        System.out.println(date);//获取当前系统的时间
    }
}
