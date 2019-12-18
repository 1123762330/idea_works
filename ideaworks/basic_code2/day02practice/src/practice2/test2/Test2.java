package practice2.test2;

import java.util.ArrayList;
import java.util.Iterator;

/*定义一个学生类Student，包含三个属性姓名、年龄、性别，创建三个学生对象存入ArrayList集合中。
A：使用迭代器遍历集合
B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。*/
public class Test2 {
    public static void main(String[] args) {

        //创建集合存放学生对象
        ArrayList<Student> list = new ArrayList<>();

        //创建学生对象
        list.add(new Student("大明", 22, "男"));
        list.add(new Student("小红", 20, "女"));
        list.add(new Student("王刚", 25, "男"));

        //使用迭代器遍历集合
        //创建迭代器
        Iterator<Student> it = list.iterator();
        //迭代遍历
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s);
        }

        //求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
        for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size(); j++) {
                    if(list.get(i).getAge()>list.get(1).getAge()){
                        if(list.get(i).getAge()>list.get(2).getAge()){
                            list.get(i).setName("小猪佩奇");
                        }else {
                            list.get(2).setName("小猪佩奇");
                        }
                    }

                }
        }
        System.out.println(list.get(2));
    }
}
