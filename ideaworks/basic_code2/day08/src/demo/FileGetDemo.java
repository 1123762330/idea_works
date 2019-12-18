package demo;

import java.io.File;

public class FileGetDemo {
    public static void main(String[] args) {
        File f = new File("D:\\Java视频\\a.txt");//绝对路径
        System.out.println("文件的绝对路径:"+f.getAbsolutePath());
        System.out.println("文件的路径字符串:"+f.getPath());
        System.out.println("文件名称:"+f.getName());
        System.out.println("文件的大小:"+f.length());

        File f2 = new File("D:\\Java视频");
        System.out.println("目录绝对路径:"+f2.getAbsolutePath());
        System.out.println("目录的路径字符串:"+f2.getPath());
        System.out.println("目录名称:"+f2.getName());
        System.out.println("目录大小:"+f2.length());

        File f3 = new File("a.txt");//相对路径,idea里面就是项目根目录
        System.out.println("文件的绝对路径:"+f3.getAbsolutePath());
        System.out.println("文件的路径字符串:"+f3.getPath());
        System.out.println("文件名称:"+f3.getName());
        System.out.println("文件的大小:"+f3.length());

    }
}
