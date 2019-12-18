package test7;
/*在main方法中，定义教师类、学生类并赋值
调用teaching()、getMyResult（）方法。*/

public class Test7 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("张三","英语");
        Student student = new Student("王五",58,teacher);
        teacher.teaching();
        student.getMyResult();
    }
}
