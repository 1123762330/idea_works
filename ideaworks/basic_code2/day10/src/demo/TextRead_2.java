package demo;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class TextRead_2 {
    public static void main(String[] args) throws IOException {
        //创建HaspMap集合
        HashMap<Integer, String> map = new HashMap<>();

        //创建输入流
        BufferedReader br = new BufferedReader(new FileReader("day10\\txt\\ini.txt"));

        //读取数据
        String line = null;
        while ((line = br.readLine()) != null) {
            //读取一行数据之后进行分割,并且将这行数据添加到集合中去
            String[] str = line.split("\\.");
            map.put(Integer.parseInt(str[0]), str[1]);
        }

        //将集合中的键进行排序
        Set<Integer> keySet = map.keySet();//获取键集合
        ArrayList<Integer> list = new ArrayList<>();//创建ArrayList存放键集合
        list.addAll(keySet);
        Collections.sort(list);//将键集合按照从小到大排序,然后通过键找到具体的值

        BufferedWriter bw = new BufferedWriter(new FileWriter("day10\\ini.txt"));
        //排序之后遍历写数据
        for (Integer key : list) {
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
