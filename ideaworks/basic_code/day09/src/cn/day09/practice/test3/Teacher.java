package cn.day09.practice.test3;

public  class Teacher extends Person{
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("老师正在疯狂的讲课");
    }
}
