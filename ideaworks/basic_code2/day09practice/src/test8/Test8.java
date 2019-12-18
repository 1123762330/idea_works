package test8;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/*我有一个文本文件score.txt，我知道数据是键值对形式的，但是不知道内容是什么。
请写一个程序判断是否有"lisi"这样的键存在，如果有就改变其实为"100"*/


public class Test8 {
    public static void main(String[] args) throws IOException {
        //获取类路径下的score.txt文件
        FileReader stream = new FileReader("day09practice\\src\\test8\\score.txt");
        //创建Properties类
        Properties properties = new Properties();
        //将stream类加载到类中
        properties.load(stream);
        //获取score.txt中的所有键
        Set<String> strings = properties.stringPropertyNames();
        //遍历键判断是否存在
        for (String string : strings) {
            if (string.equals("lisi")) {
                properties.setProperty("lisi", "100");
            }
        }
        //回写
        properties.store(new FileWriter(new File("day09practice\\src\\test8\\score.txt")), null);
    }
}
