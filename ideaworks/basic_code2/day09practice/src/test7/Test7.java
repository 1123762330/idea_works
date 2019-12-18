package test7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*请用户从控制台输入信息，程序将信息存储到文件Info.txt中。
可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。*/
public class Test7 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //首先创建输出流对象
        FileWriter fos = new FileWriter("day09practice\\src\\test7\\Info.txt",true);
        //调用Write方法{
        while (true) {
            System.out.println("请输入需要存储的字符串信息,结束请输入指定:886");
            String s=sc.nextLine();
            if (!s.equals("886")) {
                fos.write(s+"\r\n");
                fos.flush();//将数据刷入到文件中
            }else {
                break;
            }
        }
        //关闭输出流对象
        fos.close();
        System.out.println("程序结束");
    }
}
