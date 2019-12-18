package demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BurreredWriteDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10\\txt\\fost.txt",true));
        for (int i = 0; i < 3; i++) {
            bw.write("在吃饭");
            bw.newLine();
        }
        bw.close();
    }
}
