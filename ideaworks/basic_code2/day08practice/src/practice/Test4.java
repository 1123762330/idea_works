package practice;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        //指定路径
        File file = new File("day08\\src\\demo");
        //调用方法
        getAllFile(file);
    }

    public static void getAllFile(File dir) {
        //System.out.println("遍历的目录是" + dir);//打印要遍历的文件目录
        File[] files = dir.listFiles();//获取根目录文件数组

        //遍历根目录文件夹
        for (File file : files) {
            //如果以后缀名为.java结尾就输出
            if (file.getName().toLowerCase().endsWith(".java")) {
                System.out.println(file);//如果没有文件夹就直接输出根目录下的文件
            }
        }


    }
}
