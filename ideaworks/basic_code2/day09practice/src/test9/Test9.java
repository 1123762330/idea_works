package test9;
/*在D盘下有一个文本文件test.txt(里面的内容由数字和字母组成)
定义一个方法统计test.txt文件中’a’字符出现的次数。
比如a字符在文件中出现了10次则调用方法传入a后，方法内部输出：a出现10次*/

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test9 {
    public static void main(String[] args) throws IOException {
        //首先创建输入流
        FileReader fis = new FileReader("day09practice\\src\\test9\\test.txt");

        //读取内容
        ArrayList<Character> list = new ArrayList<>();
        int len;
        while ((len=fis.read())!=-1){
            list.add((char) len);//将遍历的字符添加到集合中
        }

        //关闭流
        fis.close();
        countMethod(list);
    }

    //创建统计方法
    private static void countMethod(ArrayList<Character> list) {
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals('a')){
                count++;
            }
        }
        //System.out.println(list);
        System.out.println("a出现"+count+"次");
    }
}
