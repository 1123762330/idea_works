package demo;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOSWriteDemo {
    public static void main(String[] args) throws IOException {
        //创建输出流对象
        FileOutputStream  fos = new FileOutputStream("day09\\fos.txt",true);//此处的true起追加数据作用

        //调用Write方法
        byte[]  arr={97,98,99};
        fos.write(arr);

        //换行写法
        for (int i = 0; i <arr.length ; i++) {
            fos.write("\r\n".getBytes());//换行
            fos.write(arr[i]);
            fos.write("周凌云".getBytes());
        }

        //关闭流
        fos.close();
    }
}
