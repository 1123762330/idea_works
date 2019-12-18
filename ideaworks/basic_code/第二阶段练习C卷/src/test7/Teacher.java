package test7;
/*姓名 name（String 类型）
学科 course（String类型）
实现  抽象方法teaching()，并输出"我是XX老师，我教YY学科”*/

public class Teacher implements Teach {
    private String name;
    private String course;

    public Teacher() {
    }

    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void teaching() {
        System.out.println("我是"+getName()+"老师，我教"+getCourse()+"学科");
    }
}
