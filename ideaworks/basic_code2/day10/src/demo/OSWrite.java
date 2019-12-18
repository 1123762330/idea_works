package demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OSWrite {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10\\txt\\utf_8.txt"),"utf-8");
        osw.write("你好");
        osw.close();

        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("day10\\txt\\gbk.txt"),"GBK");
        osw2.write("你好");
        osw2.close();
    }
}
