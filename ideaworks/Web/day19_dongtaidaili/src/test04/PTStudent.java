package test04;

public class PTStudent implements Student {
    @Override
    public void study() {
        System.out.println("普通的学习");
    }

    @Override
    public void eat() {
        System.out.println("学生在吃");
    }
}
