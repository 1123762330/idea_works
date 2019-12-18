package demo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesReadDemo {
    public static void main(String[] args) throws IOException {
        //创建Properties对象
        Properties prop = new Properties();
        //加载文件
        prop.load(new FileReader("day09\\prop.txt"));
        //遍历集合
        Set<String> keySet = prop.stringPropertyNames();//获取键集合
        for (String key : keySet) {//遍历具体值
            String value = prop.getProperty(key);
            System.out.println(key+"->"+value);
        }
    }
}
