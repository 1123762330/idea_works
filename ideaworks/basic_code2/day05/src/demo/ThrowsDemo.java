package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThrowsDemo {                   //这是第一种方法throws
    public static void main(String[] args) throws ParseException {
        method();
    }
                                            //这是第一种方法throws
    private static void method() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse("2018-19-10");
        System.out.println(date);

        //这是第二种方法try-catch方法解决异常
        try {
            Date date2 = format.parse("2018-10-11");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
