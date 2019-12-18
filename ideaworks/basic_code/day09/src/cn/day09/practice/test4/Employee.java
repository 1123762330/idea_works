package cn.day09.practice.test4;
/*属性:  工号,姓名
        行为:  工作方法(用简单的输出语句模拟)*/
public abstract class Employee {
    private  String worknum;
    private  String name;

    public Employee() {
    }

    public Employee(String worknum, String name) {
        this.worknum = worknum;
        this.name = name;
    }

    public String getWorknum() {
        return worknum;
    }

    public void setWorknum(String worknum) {
        this.worknum = worknum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void work();
}
