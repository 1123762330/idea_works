package cn.day09.practice.test4;
/*属性:  工号,姓名
        行为:   工作方法(为客户服务,简单输出语句模拟)*/
public class Waiter extends Employee {
    public Waiter() {
    }

    public Waiter(String worknum, String name) {
        super(worknum, name);
    }

    @Override
    public void work() {
        System.out.println("为客户服务");
    }
}
