package practice_teacher.test4;

import java.util.ArrayList;

/*
第四题：分析以下需求，并用代码实现
	1.定义Person类包含姓名：String name、年龄：int age、成绩：int score，生成空参、有参构造、set和get方法、toString方法
	2.定义Student类继承Person，属性与Person类相同
	3.查看API中ArrayList集合中的以下方法：
		(1)boolean add(E e) 方法
		(2)<T> T[] toArray(T[] a)方法
		(3)boolean addAll(Collection<? extends E> c)方法
	4.通过查看API对以上方法的学习，完成以下功能
		(1)ArrayList集合中存入5个Student对象，将ArrayList集合转成对应的数组Student[]，并遍历打印数组中的元素
		(2)定义一个存储Person对象的ArrayList集合对象list1，并存入2个Person对象，定义一个存储Student对象的ArrayList集合对象list2，
		并存入2个Student对象，调用addAll方法将list2的全部内容添加到list1中，遍历打印list1中的内容

注意:
    1)如果子类和父类都没有toString方法,直接打印对象名就是地址值
    2)如果子类通过快捷键生成的toString方法,再打印结果是空的,需要改写toString方法,通过get方法取值
    3)如果子类没有toString方法,但是父类有toString方法,打印结果机会按照父类的toString格式打印输出
 */
public class Test4 {
    public static void main(String[] args) {
        //(1)ArrayList集合中存入5个Student对象
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张一",23,89));
        list.add(new Student("张二",22,90));
        list.add(new Student("张三",21,91));
        list.add(new Student("张四",20,92));
        list.add(new Student("张五",19,93));

        //将ArrayList集合转成对应的数组Student[]
        Student[] arr = new Student[list.size()];
        list.toArray(arr);

        //遍历打印数组中的元素
        for (Student student : arr) {
            System.out.println(student);
        }
        System.out.println("----------------------");

        //(2)定义一个存储Person对象的ArrayList集合对象list1，并存入2个Person对象，
        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(new Person("熊大",10,99));
        list1.add(new Person("熊二",8,98));

        // 定义一个存储Student对象的ArrayList集合对象list2，并存入2个Student对象，
        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("光头强",30,70));
        list2.add(new Student("秃头强",35,68));

        // 调用addAll方法将list2的全部内容添加到list1中，遍历打印list1中的内容
        list1.addAll(list2);
        //System.out.println(list1);
        for (Person person : list1) {
            System.out.println(person);
        }
    }
}
