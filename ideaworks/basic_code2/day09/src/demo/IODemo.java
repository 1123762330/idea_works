package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo {
    public static void main(String[] args) throws IOException {
        //首先创建输入流
        FileInputStream fis = new FileInputStream("C:\\abc.mp3");
        //在创建输出流
        FileOutputStream fos = new FileOutputStream("D:\\abc.mp3");
        //然后读取
        int len=0;
        while ((len=fis.read())!=-1){
            //然后写入到其他地方,复制到D盘
            fos.write(len);
        }
        //关闭流
        fos.close();
        fis.close();
    }
}
