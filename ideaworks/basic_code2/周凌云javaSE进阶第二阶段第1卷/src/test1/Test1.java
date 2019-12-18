package test1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*键盘录入3个学生信息(姓名,语文成绩,数学成绩)
          求出每个学生的总分,并且将学生的信息写入Student.txt文件中
           要求文件中的效果下所示 */
public class Test1{
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("周凌云javaSE进阶第二阶段第1卷\\src\\test1\\Student.txt"));
        bw.write("姓名 语文成绩 数学成绩 总分");
        bw.newLine();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入第"+i+"个学生的姓名:");
            String name = sc.next();
            System.out.println("请输入第"+i+"个学生的语文成绩:");
            int ys = sc.nextInt();
            System.out.println("请输入第"+i+"个学生的数学成绩:");
            int ss = sc.nextInt();
            int sum = ys + ss;
            bw.newLine();
            bw.write(name+" "+ys+" "+ss+" "+sum);
            bw.newLine();
        }
        bw.close();
    }
}