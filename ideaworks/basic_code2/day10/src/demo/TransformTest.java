package demo;

import java.io.*;

public class TransformTest {
    public static void main(String[] args) throws IOException {
        //创建输入流Read和输出流Write
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10\\txt\\我是GBK格式的文本.txt"), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10\\txt\\我是utf_8格式的文件.txt"), "utf-8");
        //读取数据并写入
        int len=0;
        while ((len=isr.read())!=-1){
            osw.write(len);
        }
        //关流
        isr.close();
        osw.close();
    }
}
