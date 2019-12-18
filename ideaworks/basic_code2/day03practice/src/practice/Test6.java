package practice;

import java.util.HashSet;
import java.util.Objects;

//定义人类，包含姓名和年龄属性。创建4个人存储到HashSet中，姓名和年龄相同的人看做同一人不存储。
public class Test6 {
    public static void main(String[] args) {
        //创建HashSet集合
        HashSet<Person> hashSet = new HashSet<>();
        //创建对象并且加入集合
        hashSet.add(new Person("小红", 20));
        hashSet.add(new Person("小明", 21));
        hashSet.add(new Person("小刚", 22));
        hashSet.add(new Person("小红", 20));
        //输出结果
        System.out.println(hashSet);

    }


    static class Person {
        private String name;
        private int age;

        public Person() {
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
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

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person person = (Person) o;
            return getAge() == person.getAge() &&
                    Objects.equals(getName(), person.getName());
        }

        @Override
        public int hashCode() {

            return Objects.hash(getName(), getAge());
        }
    }
}