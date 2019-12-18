package practice;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args){
		String[] str=new String[3];
		str[0]="苹果";
		str[1]="香蕉";
		str[2]="桃子";
		
		//可以伸缩自如的类似数组的容器：ArrayList
		ArrayList<String>  gouwuche=new ArrayList<String>();
		//增加数据
		gouwuche.add("苹果");
		gouwuche.add("香蕉");
		gouwuche.add("桃子");
		gouwuche.add("芒果");
		System.out.println(gouwuche);
		
		//删除数据
		gouwuche.remove(3);
		System.out.println(gouwuche);
		
		//修改数据
		gouwuche.set(0,"apple");
		System.out.println(gouwuche);
		
		//取出数据
		String tem=gouwuche.get(0);
		System.out.println(tem);
		
		//取出所有数据
		for(int i=0;i<gouwuche.size();i++){
			System.out.println(gouwuche.get(i));
		}
	}

}
