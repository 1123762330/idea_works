package demo;

import java.io.File;

public class FileList {
    public static void main(String[] args) {
        //指定文件目录
        File f = new File("day08");
        //调用list方法获取
        String[] list = f.list();

        //遍历循环
        for (String s : list) {
            System.out.println(s);
        }


        //调用listFiles获取详细内容
        File[] files = f.listFiles();
        //遍历循环
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
