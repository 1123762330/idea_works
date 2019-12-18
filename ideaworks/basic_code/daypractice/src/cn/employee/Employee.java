package cn.employee;

public abstract  class Employee {
	String id;
	String name;
	public String getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public void setId(String id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	//定义一个工作方法
	public abstract void work();
}
