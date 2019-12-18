package demo;

import javax.xml.crypto.Data;
import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        //创建输入缓冲流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day10\\fost.txt"));
        //创建输出缓冲流对象
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day09\\txt\\fost.txt"));
        //开始读取数据
        byte[] bytes = new byte[1024];//一次读取一个字符数组
        int len=0;
        while ((len=bis.read(bytes))!=-1){//此处读取一个数组数据
            bos.write(bytes,0,len);//此处就写入一个数组数据
        }
        //关闭流
        bis.close();
        bos.close();
        long end = System.currentTimeMillis();
        System.out.println("程序运行用了"+(end-start)+"毫秒");
    }
}
