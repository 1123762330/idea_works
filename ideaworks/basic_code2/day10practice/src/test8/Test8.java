package test8;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test8 {
    public static void main(String[] args) throws IOException {
        //创建输入流
        BufferedReader br = new BufferedReader(new FileReader("day10practice\\src\\test8\\text1.txt"));
        ArrayList<Object> list = new ArrayList<>();
        String line = null;
        while ((line=br.readLine())!=null){
            list.add(line);
        }
        System.out.println(list);
        //进行反转
        Collections.reverse(list);
        System.out.println("反转之后的集合为:"+list);
        br.close();
    }
}
