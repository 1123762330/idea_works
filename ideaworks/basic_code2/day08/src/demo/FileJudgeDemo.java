package demo;

import java.io.File;

public class FileJudgeDemo {
    public static void main(String[] args) {
        File f = new File("D:\\Java视频\\a.txt");//文件绝对路径
        File f2 = new File("D:\\Java视频");//目录绝对路径

        //判断是否存在
        System.out.println("文件存在吗? " + f.exists());
        System.out.println("目录存在吗? " + f2.exists());

        //判断是文件还是目录
        System.out.println("D:\\Java视频\\a.txt是文件吗? " + f.isFile());
        System.out.println("D:\\Java视频是目录吗 " + f2.isDirectory());
    }
}
