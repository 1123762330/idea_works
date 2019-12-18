package practice.test11;
/*2.	在测试类中定义一个学生数组，存储学生信息。
3.	使用Lambda省略格式写法对学生数组按照考试成绩由高到低进行排序。*/

import java.util.Arrays;

public class Test11 {
    public static void main(String[] args) {
        Person[] arr = {new Person("小周", 59),
                        new Person("小王", 90),
                        new Person("小郑", 88)};
        //进行降序处理
        Arrays.sort(arr,(Person o1,Person o2)-> o2.getScore()-o1.getScore());

        //遍历循环
        for (Person student: arr) {
            System.out.println(student);
        }
    }
}
