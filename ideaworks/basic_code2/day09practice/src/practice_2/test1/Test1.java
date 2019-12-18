package practice_2.test1;
/*根据需求、完成代码
        1.项目根目录下建立文件： user.txt，文件中存放用户名和登录密码，格式：用户名，密码,如：aaa,123；
        2. user.txt文件中初始存放的用户信息有如下：
        jack,123
        rose,123
        tom,123
        3.要求完成如下功能：
        程序运行时：控制台提示用户输入注册的用户名和密码；
        验证键盘录入的用户名跟user.txt中已注册的用户名是否重复：
        是：控制台提示：用户名已存在
        否：将键盘录入的用户名及密码写入user.txt文件，并在控制台提示：注册成功*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day09practice\\src\\practice\\test1\\user.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day09practice\\src\\practice\\test1\\user.txt", true));
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //读取遍历数组
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] str = line.split(",");
            list.addAll(Arrays.asList(str));
        }
        br.close();
        System.out.println(list);

        while (true) {
            System.out.println("请输入用户名:");
            String s = sc.nextLine();
            if (list.contains(s)) {
                System.out.println("用户名已存在");
                break;
            } else {
                System.out.println("新用户,请继续输入密码");
                bw.write("\r\n" + s + ",");
                bw.write(sc.nextLine());
                System.out.println("用户注册成功!");
                break;
            }
        }
        bw.close();
    }

}
