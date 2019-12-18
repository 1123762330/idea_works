package cn.day09.practice.test4;
/*属性:  工号,姓名,奖金
        行为:  工作方法(管理员工,简单输出语句模拟)*/
public class Manager extends Employee {
    private int bonus;

    public Manager() {
    }

    public Manager(String worknum, String name, int bonus) {
        super(worknum, name);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理员工");
    }

}
