package demo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedFOS {
    public static void main(String[] args) throws IOException {
        //创建输出流对象
        FileOutputStream fos = new FileOutputStream("day10\\txt\\fost.txt");
        //创建缓冲流对象
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //调用Write方法
        bos.write("你好呀,在干嘛呢".getBytes());
        //关流
        bos.close();

    }
}
