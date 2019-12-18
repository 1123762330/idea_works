package practice2.test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/*定义一个学生类Student，包含三个属性姓名、年龄、性别，创建三个学生对象存入ArrayList集合中。
A：使用迭代器遍历集合
B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。*/

public class Test2_1 {
    public static void main(String[] args) {
        //创建集合存放学生对象
        ArrayList<Student> list = new ArrayList<>();

        //创建学生对象
        list.add(new Student("大明", 30, "男"));
        list.add(new Student("小红", 20, "女"));
        list.add(new Student("王刚", 25, "男"));
        list.add(new Student("李三", 30, "男"));

        //将学生对象年龄放到学生年龄数组里面
        int[] studentAge=new int[list.size()];

        //遍历集合,将具体学生年龄存放在年龄数组里面
        for (int i = 0; i < list.size(); i++) {
            studentAge[i]=list.get(i).getAge();
        }

        //sort数组进行排序,回去年龄最大的值
        Arrays.sort(studentAge);

        for (int i = 0; i < list.size(); i++) {

            //具体的学生年龄
            int age=list.get(i).getAge();

            //当年龄数组里面最大值和集合里面最大值相等,修改这个集合里面最大年龄的人的姓名
            while (studentAge[studentAge.length-1]==age){
                list.get(i).setName("小猪佩奇");
                break;
            }
        }

        //使用迭代器进行遍历输出

        //创建迭代器
        Iterator<Student> it = list.iterator();
        //遍历输出
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
