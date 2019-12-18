package cn.employee;

public class Test {
	public static void main(String[] args) {
		//创建JavaEE工程师员工对象
		Network ee = new Network();
		//设置该员工的编号
		ee.setId("000015");
		//设置该员工的姓名
		ee.setName("小明");
		//调用该员工的工作方法
		ee.work();
	}
}


