package test2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入球员名:");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<String, String> map = new HashMap<>();//创建HashMap集合存放键
        //创建写入流对象
        BufferedReader br = new BufferedReader(new FileReader("周凌云javaSE进阶第二阶段第1卷\\src\\test2\\player.txt"));
        //读取字符串,进行分割,添加到集合中
        String line;
        while ((line = br.readLine()) != null) {
            String[] str = line.split(",");
            map.put(str[0], str[1]);
        }
        //关流
        br.close();
        //创建键集合
        Set<String> keySet = map.keySet();
        //进行判断
        if (keySet.contains(s)) {
            System.out.println(s + "所属于" + map.get(s));
        } else {
            System.out.println("没有这个球员");
        }
    }
}
