package test2;

import java.io.*;

/*递归遍历当前项目根目录（含子目录），将“.java”结尾的文件的绝对路径存储到当前项目根目录的“result.txt”文件中，
每个文件的绝对路径独立一行。*/
public class Test2 {
    public static void main(String[] args) throws IOException {
        File file = new File("周凌云javaSE进阶第二阶段第3卷");
        getAllFile(file);
    }

    public static void getAllFile(File dir) throws IOException {
        //System.out.println("遍历的目录是" + dir);//打印要遍历的文件目录
        File[] files = dir.listFiles();//获取根目录文件数组
        BufferedWriter bw = new BufferedWriter(new FileWriter("周凌云javaSE进阶第二阶段第3卷\\src\\test2\\result.txt",true));
        //遍历根目录文件夹
        for (File f : files) {
            if (f.isDirectory()) { //如果有文件夹就进行继续遍历
                getAllFile(f);//遍历子目录
            }
            //如果以后缀名为.java结尾就输出
            if (f.getName().toLowerCase().endsWith(".java")) {
                bw.write(f.getCanonicalPath()+"\r\n");
                bw.flush();
            }
        }
    }
}
