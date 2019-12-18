package demo;
/*使用步骤:
        1.创建Properties集合对象,添加数据
        2.创建字节输出流/字符输出流对象,构造方法中绑定要输出的目的地
        3.使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
        4.释放资源*/

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesWriteDemo {
    public static void main(String[] args) throws IOException {
        //1.创建Properties集合对象,添加数据
        Properties prop = new Properties();
        prop.setProperty("赵丽颖","153");
        prop.setProperty("王菲","163");
        prop.setProperty("赵芹儿","166");
        //2.创建输出流对象
        FileWriter fw = new FileWriter("day09\\prop.txt",true);
        //3.调用store方法
        prop.store(fw,"");
        //4.关流
        fw.close();
    }
}
