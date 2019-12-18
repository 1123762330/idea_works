package cn.day08.demo.staticdemo;

public class StaticMethod {
    public static void main(String[] args) {
        Person people= new Person();//创建对象
        people.method();//成员方法

        people.method2();//正确,但是不推荐
        Person.method2();//静态成员方法,正确,推荐
    }
}
