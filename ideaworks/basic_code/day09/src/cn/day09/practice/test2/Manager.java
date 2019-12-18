package cn.day09.practice.test2;
/*属性：
        姓名 工号 工资 奖金
        行为：
        工作work*/
public class Manager extends Employee {
    private int bonus;

    public Manager() {
    }

    @Override
    public void work() {

    }

    public Manager(String name, String worknumber, int salary, int bonus) {
        super(name, worknumber, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}


