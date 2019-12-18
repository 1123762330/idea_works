package test1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1_1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //创建集合,将学生存放在集合中
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入第" + i + "学生的姓名:");
            String name = sc.next();
            System.out.println("请输入第" + i + "学生的语文成绩:");
            int ys = sc.nextInt();
            System.out.println("请输入第" + i + "学生的数学成绩:");
            int ss = sc.nextInt();
            int sum = ys + ss;//总分
            Student student = new Student(name, ys, ss, sum);//将数据进行封装
            list.add(student);//存放数据
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("周凌云javaSE进阶第二阶段第1卷\\src\\test1\\Student1.txt"));
        bw.write("姓名   语文成绩   数学成绩   总分");
        bw.newLine();
        //遍历学生集合,写入到文件中
        for (Student s : list) {
            String name = s.getName();
            int sscore = s.getSscore();
            int yscore = s.getYscore();
            int sum = s.getSum();
            bw.write(name + " \t" + yscore + " \t\t" + sscore + " \t\t" + sum);
            bw.newLine();
            bw.flush();
        }
        bw.close();//关流
    }
}
