package test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//在测试类中，定义集合ArrayList，并声明Book泛型，将文本中每一行内容封装成Book对象, 并读取到集合中
public class Test1 {
    public static void main(String[] args) throws IOException {
        //定义集合ArrayList
        ArrayList<Book> list = new ArrayList<>();
        //创建读取缓冲流
        BufferedReader br = new BufferedReader(new FileReader("周凌云javaSE进阶第二阶段测试\\src\\test1\\book.txt"));
        //调用Read方法,读取数据
        String line;
        while ((line = br.readLine()) != null) {
            //读取完成之后进行分割
            String[] str = line.split(",");
            //保存到集合中
            list.add(new Book(str[0],Double.parseDouble(str[1]),Integer.parseInt(str[2])));
        }
        //System.out.println(list);

        double sum=0;
        for (Book book : list) {
            double v = book.getNum() * book.getPrice();
            sum+=v;
            System.out.println(book.getBookname()+",共计"+v+"元");
        }
        System.out.println("图书总金额为"+sum);
    }
}
