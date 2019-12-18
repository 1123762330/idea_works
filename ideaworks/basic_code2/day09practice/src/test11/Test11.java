package test11;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*从控制台接收3名学员的信息，每条信息存储到一个Student对象中，将多个Student对象存储到一个集合中。
输入完毕后，将所有学员信息存储到文件Student.txt中。每名学员信息存储一行，多个属性值中间用逗号隔开。*/
public class Test11 {
    public static void main(String[] args) throws IOException {
        System.out.println("请按照格式输入学生信息:姓名:xx,性别:xx,年龄:xx");
        Scanner sc = new Scanner(System.in);

        //创建学生集合
        ArrayList<Student> list = new ArrayList<>();

        //创建3个学生对象
        for (int x = 1; x <= 3; x++) {
            System.out.println("请录入第" + x + "个的学习信息");
            System.out.println("姓名：");
            String name = sc.next();
            System.out.println("性别：");
            String sex = sc.next();
            System.out.println("年龄：");
            int age = sc.nextInt();
            //创建学生对象
            Student s = new Student(name, sex, age);
            list.add(s);
            System.out.println("学生信息添加完毕!");

        }
        //System.out.println(list);

        //创建输出流
        FileWriter fos = new FileWriter("day09practice\\src\\test11\\Student.txt",true);
        //调用write方法
        for (int i = 0; i<list.size(); i++) {
            // 1.获取集合中每一个学生对象
            Student s = list.get(i);
            // 2.获取对象中的每一个属性值,多个属性值中间用逗号隔开
            String line =s.getName() + "," + s.getSex() + "," + s.getAge();
            // 3.按照指定的格式把对象的属性值，写入到文件中
            fos.write(line+"\r\n");
        }

        //关闭流
        fos.close();
    }
}
