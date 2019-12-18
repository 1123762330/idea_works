package test7;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

//从键盘录入一行字符串，利用字节打印流将该行字符串保存到当前项目根目录下的d.txt文件中
public class Test7 {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入一行字符串:");
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();

        //创建打印流对象
        PrintStream ps = new PrintStream("day10practice\\src\\test7\\d.txt");
        //存入数据
        //ps.write(s.getBytes());
        ps.println(s);
        //关流
        ps.close();
        System.setOut(ps);
    }
}
