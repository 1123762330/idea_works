package test6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
//利用转换输入流将当前项目根目录下使用gbk编码的a.txt文件的内容读取出来，并打印在控制台上。
public class Test6 {
    public static void main(String[] args) throws IOException {
        //创建输入流
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10practice\\src\\test5\\a.txt"),"GBK");
        //读取数据
        int len=0;
        char[] chars = new char[1024];
        while ((len=isr.read(chars))!=-1){
            System.out.print((new String(chars,0,len)));
        }
        //关闭流
        isr.close();
    }
}
