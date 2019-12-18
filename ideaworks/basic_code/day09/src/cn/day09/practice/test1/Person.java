package cn.day09.practice.test1;
/*属性：
        姓名name、性别gender、年龄age、国籍nationality；
        方法：
        吃饭eat、睡觉sleep，工作work。*/

public abstract class Person {
    private String name;
    private String sex;
    private int age;
    private String nationality;

    public Person() {
    }

    public Person(String name, String sex, int age, String nationality) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }
    public abstract void work(String name);
}
