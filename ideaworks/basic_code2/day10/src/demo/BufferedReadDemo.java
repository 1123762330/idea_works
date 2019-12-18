package demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReadDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day10\\txt\\fost.txt"));
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();

    }
}
