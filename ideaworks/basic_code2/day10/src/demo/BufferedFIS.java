package demo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedFIS {
    public static void main(String[] args) throws IOException {
        //创建输入流
        FileInputStream fis = new FileInputStream("day10\\txt\\fost.txt");
        //创建输入流缓冲区
        BufferedInputStream bis = new BufferedInputStream(fis);
        /*int len=0;//一次只读一个
        while ((len=bis.read())!=-1){
            System.out.println(len);
        }
        */
        byte[] bytes = new byte[1024];//一次读取一个字符数组
        int len=0;
        while ((len=fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        //关闭流
        fis.close();
    }
}
