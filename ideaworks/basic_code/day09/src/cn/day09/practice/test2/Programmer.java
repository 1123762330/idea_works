package cn.day09.practice.test2;
/*属性：
        姓名 工号 工资
        行为：
        工作work*/
public class Programmer extends Employee {
    public Programmer() {
    }

    public Programmer(String name, String worknumber, int salary) {
        super(name, worknumber, salary);
    }

    @Override
    public void work() {

    }

}
