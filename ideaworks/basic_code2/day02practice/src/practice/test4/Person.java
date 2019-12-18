package practice.test4;
/*1.定义Person类包含姓名：String name、年龄：int age、成绩：
int score，生成空参、有参构造、set和get方法、toString方法*/

public class Person {
    private String name;
    private int age;
    private int score;

    public Person() {
    }

    public Person(String name, int age, int score) {
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
