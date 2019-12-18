package demo;

import java.io.FileWriter;

public class IOException {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("day09\\fos.txt", true);//指定路径
            for (int i = 0; i < 10; i++) {//调用方法
                fw.write("HelloWorld" + i + "\r\n");
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } finally {//一定执行的程序
            if(fw!=null){//如果不为空就执行关流
                try {
                    fw.close();
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
