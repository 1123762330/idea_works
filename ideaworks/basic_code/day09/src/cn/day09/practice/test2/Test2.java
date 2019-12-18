package cn.day09.practice.test2;

public class Test2 {
    public static void main(String[] args) {
        Manager manager = new Manager("张三丰","heima001",30000,100000);
        Programmer p = new Programmer("张无忌", "heima010", 20000);
        System.out.println("manager:"+manager.getName()+":"+manager.getWorknumber()+":"
                +manager.getSalary()+":"+manager.getBonus());
        System.out.println("programmer:"+p.getName()+":"+p.getWorknumber()+":"+p.getSalary());
    }
}
