package practice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/*键盘录入一个文件夹路径，删除该文件夹以及文件夹路径下的所有文件。
要求：录入的文件夹里面要有多个文件，不能包含有子文件夹。
提示：如果文件夹里面有文件，则需要先将文件删除才能删除文件夹。*/

public class Test5 {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入一个文件路径:");
        Scanner scanner = new Scanner(System.in);
        String s=scanner.next();
        //文件夹创建
        File f1 = new File(s);
        method(f1);
    }

    public static void method(File f){
        File[] files = f.listFiles();//获取路径下的子文件和子文件夹
        for (File file : files) {
            if(file.isDirectory()){
                method(file);
            }
            System.out.println(file.delete());
        }
    }
}
