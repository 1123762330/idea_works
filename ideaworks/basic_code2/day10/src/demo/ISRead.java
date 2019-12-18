package demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ISRead {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10\\txt\\utf_8.txt"),"utf-8");
        int len=0;
        while ((len=isr.read())!=-1){
            System.out.println((char) len);
        }
        isr.close();
    }
}
