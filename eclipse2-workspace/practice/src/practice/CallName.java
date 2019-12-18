package practice;

import java.util.Random;

public class CallName {
	public static void main(String[] args) {
		//创建人员数组
		String[] str= {"张三","李四","王五","大哥","二哥","三弟","五妹","小周"};
		//遍历数组
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);//输出人员名称
		}
		//产生一个随机数,作为下标索引
		Random ran= new Random();
		//产生范围是0-数组长度的范围随机数
		int index=ran.nextInt(str.length);
		System.out.println("抽中的人是:"+str[index]);
	}

}
