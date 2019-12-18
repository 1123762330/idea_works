package cn.day09.practice.test1;

public class Test1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.work("学生");

        Worker worker = new Worker();
        worker.work("工人");

        StudentLeader leader = new StudentLeader();
        leader.work("学生干部");

    }
}
