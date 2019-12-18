package test4;
/*实现一个验证码小程序，要求如下：
 1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占一行；
2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存在控制台提示验证失败*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //创建输出流
        FileWriter fw = new FileWriter("day10practice\\src\\test4\\data.txt",true);
        //调用Write方法
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入第" + i + "个字符串验证码:");
            fw.write(sc.nextLine() + "\r\n");
        }
        //关闭流
        fw.close();

        //创建输入流
        BufferedReader fr = new BufferedReader(new FileReader("day10practice\\src\\test4\\data.txt"));
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //将遍历的字符串添加到集合中
        String line;
        while ((line=fr.readLine())!=null){
            list.add(line);
        }

        //System.out.println(list);
        //判断验证码
        while (true){
            System.out.println("请输入验证码:");
            String s = sc.nextLine();
            if(list.contains(s)){
                System.out.println("验证码输入正确");
                break;
            }else {
                System.out.println("验证码输入错误");
            }
        }
        fr.close();
    }
}
