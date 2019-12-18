package test5;
/*现有一字符串：”我爱Java”。将该字符串保存到当前项目根目录下的a.txt文件中。
要求：使用gbk编码保存。
注意：idea的默认编码是utf-8,所以可以通过filesettingsfile encodings设置为gbk格式，否则打开a.txt文件看到的将会是乱码。*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter fw = new OutputStreamWriter(new FileOutputStream("day10practice\\src\\test5\\a.txt",true),"GBK");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入 我爱java :");
        fw.write(scanner.nextLine());
        fw.close();
    }
}
