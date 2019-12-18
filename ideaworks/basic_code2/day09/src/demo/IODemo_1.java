package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo_1 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        //首先创建输入流
        FileInputStream fis = new FileInputStream("C:\\fos.txt");
        //在创建输出流
        FileOutputStream fos = new FileOutputStream("D:\\fos.txt");

        //然后读取
        byte[] bytes=new byte[1024];//创建缓冲流,提高效率
        int len=0;
        while ((len=fis.read(bytes))!=-1){
            //然后写入到其他地方,复制到D盘
            fos.write(len);
        }

        //关闭流
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println("复制一共用了"+(end-start)+"毫秒");
    }
}
