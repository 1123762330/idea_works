package demo;

import java.io.FileInputStream;
import java.io.IOException;

public class FOSReadDemo {
    public static void main(String[] args) throws IOException {
        //创建读取流对象,输入流对象
        FileInputStream fis = new FileInputStream("day09practice\\score.txt");

        //调用read方法,一次只能读取一个字节
        int read;
        while ((read=fis.read())!=-1){//不等于-1的时候,一直循环取值
            System.out.println((char)read);
        }

        //第二种方法,一次读取一个数组
        byte[] bytes=new byte[1024];//定义存储字节的数组
        int len=0;//定义每次读取的有效字节个数
        while ((len=fis.read(bytes))!=-1){//当字节个数不等于-1,说明没有读到末尾
            System.out.println((char)len);
        }

        //关闭流
        fis.close();
    }
}
