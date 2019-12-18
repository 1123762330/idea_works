package demo.xuliehua;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class OISdemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day10\\txt\\person.txt"));
        //2.使用ObjectInputStream对象中的方法readObject读取保存对象的文件
        Object obj = ois.readObject();
        //3.释放资源
        ois.close();
        //4.使用读取出来的对象(打印)
        System.out.println(obj);
        Person p = (Person)obj;
        System.out.println(p.getName()+p.getAge());
    }
}
