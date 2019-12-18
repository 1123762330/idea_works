package test10;
/*从控制台循环接收用户录入的学生信息，输入格式为：学号-学生名字
        将学生信息保存到D盘下面的stu.txt文件中，一个学生信息占据一行数据。
        当用户输入end时停止输入。*/

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) throws IOException {
        System.out.println("请在控制台输入学生信息，输入格式为：学号-学生名字");
        Scanner sc=new Scanner(System.in);
        //创建输出流
        FileWriter fos=new FileWriter("day09practice\\src\\test10\\stu.txt");
        System.out.println("请输入学生信息:结束请输入指令:end");

        //调用Write方法
        while(true){
            String s = sc.nextLine();
            //byte[] bytes =s.getBytes();
            if(!s.equals("end")){
                fos.write(s+"\r\n");
                fos.flush();
            }else{
                break;
            }
        }
        //关闭流
        fos.close();
        System.out.println("程序结束");

    }
}
