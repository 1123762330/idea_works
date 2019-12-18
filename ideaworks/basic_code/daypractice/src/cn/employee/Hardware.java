package cn.employee;

public class Hardware extends Maintainer {
	public void work() {
		System.out.println("员工号为 " + getId() + " 的 " + getName() + " 员工，正在修复打印机");
	}
}