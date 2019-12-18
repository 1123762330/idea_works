package cn.day09.practice.test1;
/*增加属性：
        单位unit、工龄workAge；
        方法:
        重写工作方法（工人的工作是盖房子）。*/
public class Worker extends Person {
    private String unit;
    private int workAge;

    public Worker() {
    }

    public Worker(String name, String sex, int age, String nationality, String unit, int workAge) {
        super(name, sex, age, nationality);
        this.unit = unit;
        this.workAge = workAge;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    @Override
    public void work(String name ) {
        System.out.println(name+"盖房子");
    }

}
