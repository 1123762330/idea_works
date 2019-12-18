package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
十三、分别用Comparable和Comparator两个接口对下列四位同学的成绩做降序排序，如果成绩一样，
那在成绩排序的基础上按照年龄由小到大排序。
 */
public class Test13 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("liusan",25,90F));
        list.add(new Student("lisi",22,90F));
        list.add(new Student("wangwu",20,99F));
        list.add(new Student("sunliu",22,100F));
        System.out.println("排序前：");
        System.out.println(list);
        // 自然排序 实现Comparable接口，重写compareTo(T o)方法
        // sunliu wangwu liusan lisi
        //Collections.sort(list);

        // 比较器排序，传递一个实现了Comparator接口的实现类，重写compare(T o1,T o2)方法
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 分数相同，按照年龄的升序排
                if(o2.getScore() == o1.getScore()){
                    return o1.getAge() - o2.getAge();
                }

                // 分数不同，按照分数降序排
                return o2.getScore() > o1.getScore() ? 1 : -1;
            }
        });

        System.out.println("排序后：");
        System.out.println(list);

    }

    static class Student implements Comparable<Student> {//内部类
         String name;
         int age;
         float score;

        public Student() {
        }

        public Student(String name, int age, float score) {
            this.name = name;
            this.age = age;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public float getScore() {
            return score;
        }

        public void setScore(float score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", score=" + score +
                    '}';
        }

        @Override
        public int compareTo(Student o) {
            // 成绩做降序排序，如果成绩一样，
            // 那在成绩排序的基础上按照年龄由小到大排序
            // o
            // this
        /*if(o.score == this.score){
//            return 0;
            return this.age - o.age;
        }else if(o.score > this.score){
            return 1;
        }else {
            return -1;
        }*/

            // 分数相同，按照年龄的升序排
            if(o.score == this.score){
                return this.age - o.age;
            }

            // 分数不同，按照分数降序排
            return o.score > this.score ? 1 : -1;
        }

}
}
