package cn.itheima.test6;
//创建Student 对象,并赋值姓名为张三,年龄为20,先调用sleep()方法，再调用playGame()方法完成测试
public class Test6 {
    public static void main(String[] args) {
        Student student = new Student(20,"张三");
        student.sleep();
        student.playGame();
    }
}
