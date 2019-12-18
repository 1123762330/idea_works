package demo;

import java.io.File;
import java.io.IOException;

/*（1）在你的当前模块根目录下，创建一个hello\\world\\aaa.java文件，hello文件夹不存在
（2）将hello文件夹删除*/

public class FileNewDemo {
    public static void main(String[] args) throws IOException {

        //文件夹创建
        File f1 = new File("day08\\Hello\\World");
        System.out.println(f1.mkdirs());

        //创建文件
        File f2 = new File("day08\\Hello\\World\\aaa.java");
        System.out.println(f2.createNewFile());

        //删除文件
        File f3 = new File("day08\\Hello\\World\\aaa.java");
        System.out.println(f3.delete());

        //删除文件夹
        File f4 = new File("day08\\Hello\\World");
        System.out.println(f4.delete());

        //删除文件夹
        File f5 = new File("day08\\Hello");
        System.out.println(f5.delete());

    }
}
