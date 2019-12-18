package practice;

import java.io.File;
import java.util.Scanner;

//从键盘接收一个文件夹路径,获得该文件夹大小并输出到控制台。
public class Test6 {
    static long sum = 0;
    public static void main(String[] args) {
        System.out.println("请输入一个文件夹的路径:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //指定文件夹路径
        File f = new File(str);

        //判断有没有这个文件夹
        if (f.exists()) {//如果存在
            getLength(f);

        } else {
            System.out.println("文件路径出错");
        }
        System.out.println(sum);
    }

    public static void getLength(File dir) {
        File[] files = dir.listFiles();//获取文件夹路径下的所有文件夹和文件
        for (File file : files) {
            if (file.isDirectory()) {
                getLength(file);//遍历子目录
            }
            long f = file.length();//获取文件的大小
            sum+=f;//文件大小相加
        }
    }
}
