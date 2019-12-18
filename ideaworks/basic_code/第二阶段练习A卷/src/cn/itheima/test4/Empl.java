package cn.itheima.test4;
/*1.定义一个员工类Empl，包含满参构造方法和以下成员：
        成员属性：
        薪资salary（int类型）
        get/set方法*/
public class Empl {
    private  int salary;

    public Empl() {
    }

    public Empl(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
