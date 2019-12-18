package cn.day09.practice.test3;
/*属性:   姓名,年龄
        行为:   吃饭
        老师有特有的方法:   讲课*/
public abstract class Person {
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
    public abstract void work();
    public  void eat(String name){
        System.out.println(name+"正在吃饭");
    }
}
