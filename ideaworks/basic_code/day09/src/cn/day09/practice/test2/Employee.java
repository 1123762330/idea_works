package cn.day09.practice.test2;

public abstract class Employee {
    private String name;
    private String worknumber;
    private int salary;

    public Employee() {
    }

    public Employee(String name, String worknumber, int salary) {
        this.name = name;
        this.worknumber = worknumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorknumber() {
        return worknumber;
    }

    public void setWorknumber(String worknumber) {
        this.worknumber = worknumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public abstract void work();
}
