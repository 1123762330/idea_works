package demo;

import java.io.*;
import java.util.HashMap;

public class TextRead {
    public static void main(String[] args) throws IOException {
        //创建HaspMap集合
        HashMap<String, String> map = new HashMap<>();
        //创建输入输出流
        BufferedReader br = new BufferedReader(new FileReader("day10\\txt\\in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10\\txt\\out.txt"));
        //读取数据
        String line = null;
        while ((line = br.readLine()) != null) {
            //读取完成之后进行分割
            String[] str = line.split("\\.");
            //保存到集合中
            map.put(str[0], str[1]);
        }
        //读完之后写数据
        for (String key : map.keySet()) {
            String value = map.get(key);//通过键获取值
            line = key + "." + value;//键和值拼接成行
            bw.write(line);//写入一行数据
            bw.newLine();//换行
        }
        //最后关流
        br.close();
        bw.close();
    }
}
