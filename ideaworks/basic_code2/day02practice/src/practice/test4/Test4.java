package practice.test4;

import java.util.ArrayList;
import java.util.Collection;

/*(1)ArrayList集合中存入5个Student对象，将ArrayList集合转成对应的数组Student[]，并遍历打印数组中的元素*/
public class Test4 {
    public static void main(String[] args) {

        //创建集合对象
        Collection<Student> coll = new ArrayList<>();

        //创建5个Student对象
        Student s1 = new Student("小明",20,60);
        Student s2 = new Student("张三",23,78);
        Student s3 = new Student("李四",25,65);
        Student s4 = new Student("王五",27,60);
        Student s5 = new Student("老李",30,99);

        //将对象存到集合中
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);
        coll.add(s4);
        coll.add(s5);

        //将ArrayList集合转成对应的数组Student[]
        Student[] str=new Student[coll.size()];
        coll.toArray(str);

        //遍历集合输出结果
        for(Student s:str){
            System.out.println(s);
        }

        System.out.println("==============================");

 /*(2)定义一个存储Person对象的ArrayList集合对象list1，并存入2个Person对象，定义一个存储Student对象的ArrayList集合 对象list2，
   并存入2个Student对象，调用addAll方法将list2的全部内容添加到list1中，遍历打印list1中的内容*/

        //定义一个存储Person对象的ArrayList集合对象list1，并存入2个Person对象
        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(new Person("老王",45,48));
        list1.add(new Person("老周",23,98));

        //定义一个存储Student对象的ArrayList集合 对象list2，并存入2个Student对象
        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("小明",13,88));
        list2.add(new Student("小红",15,89));

        //调用addAll方法将list2的全部内容添加到list1中
        boolean b = list1.addAll(list2);
        System.out.println("添加是否成功："+b);
        
        //遍历打印list1中的内容
        for (Person p:list1) {
            System.out.println(p);
        }

    }
}
